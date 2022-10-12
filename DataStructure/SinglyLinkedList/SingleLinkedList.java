package SinglyLinkedList;
import Interface.List;

public class SingleLinkedList<E> implements List {
    private Node<E> head;           //가장 첫 노드를 가리키는 변수
    private Node<E> tail;           //가장 마지막 노드를 가리키는 변수
    private int size;               //리스트에 요소의 개수

    //SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();
    public SingleLinkedList() {     //초기화
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //특정위치의 노드를 반환하는 메서드
    private Node<E> search(int index) {

        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException();

        Node<E> x = head;

        for(int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    //리스트에 첫번째에 요소를 추가
    public void addFirst(E value) {
        Node<E> newNode = new Node<>(value);    //새 노드를 생성 후
        newNode.next = head;                    //새 노드의 다음노드는 현재 head노드가 된다
        head = newNode;                         //head는 이제부터 newNode가된다
        size++;

        if(head.next == null) {
            tail = head;
        }
    }

    //리스트에 끝에 요소를 추가
    public void addLast(E value) {
        Node<E> newNode = new Node<>(value);    //새 노드 생성
        if (size == 0) {                        //만약 노드가 비어있따면
            addFirst(value);                    //앞서구현했던 addFirst메서드 호출
            return;
        }

        tail.next = newNode;                    //현재의 tail이 newNode를 가리키게 해줌
        tail = newNode;                         //tail은 이제부터 newNode다
        size++;
    }

    @Override
    public boolean add(Object value) {
        addLast((E)value);
        return true;
    }

    //특정 인덱스에 요소 삽입.
    public void add(int index, Object value) {
        Node<E> newNode = new Node<>((E) value);

        if (index < 0 || index < size)
            throw new IndexOutOfBoundsException();  //예외 던져주기

        if (index == 0) {
            addFirst((E) value);
            return;
        }

        Node<E> prevNode = search(index - 1);   //search메서드로 삽입하려는 index의 이전 노드를 선언해준다
        Node<E> nextNode = search(index + 1);   //search메서드로 삽입하려는 index의 다음 노드를 선언해준다

        prevNode.next = null;           //이전노드를 unlinking
        prevNode.next = newNode;        //unlinking한 이전 노드를 새로운노드에 연결
        newNode.next = nextNode;        //새로운노드는 다음노드를 가리키게된다.
        size++;
    }

    //가장 앞에있는 요소 제거
    public E remove() {
        Node<E> headNode = head;

        if(headNode == null)
            throw new IndexOutOfBoundsException();  //예외 던져주자

        E removedElement = headNode.data;

        head = headNode.next;
        headNode.data = null;
        headNode.next = null;
        size--;

        if(size == 0)               //삭제후 size가 0이 되는것? 유일한 노드를 삭제했으므로
            tail = null;            //가리킬 노드가 없다 ㅋ

        return removedElement;      //삭제된 노드 반환
    }

    /**특정 인덱스의 요소를 삭제하기
     * 1. find node
     * 2. unlinking
     * 3. link new node
     * @param index
     * @return
     */
    public E remove(int index) {
        //예외처리부터
        if(index < 0 || index < size)
            throw new IndexOutOfBoundsException();

        if(index == 0)          //만약 삭제하고싶은 인덱스가 첫번째라면
            return remove();    //boolean remove 호출(맨 앞에있는 원소 삭제)

        Node<E> removedNode = search(index);    //삭제할 노드
        Node<E> prevNode = search(index - 1);   //삭제할 노드 이전 노드
        Node<E> nextNode = search(index + 1);   //삭제할 노드 뒤의 노드

        E returnElement = (E) removedNode.next;

        prevNode.next = nextNode;               //이전 노드가 삭제할 노드 앞의 노드를 가리키게 한다
        if(prevNode.next == null)               //만약 삭제했던 노드가 마지막 노드라면 (마지막노드라면 위에서 설정한게 null이 된다.)
            tail = prevNode;                    //갱신된 노드는 tail이 된다.

        removedNode.data = null;
        removedNode.next = null;
        size--;

        return returnElement;
    }

    /**
     * 원하는 요소를 삭제하고싶을때
     * 1. 삭제하려는 요소가 존재하는지? true : false
     * 2. true :  remove(int index)
     * 3. false : false;
     */

    @Override
    public boolean remove(Object value) {
        boolean isNode = false;
        Node<E> x = head;

        for(; x != null; x = x.next) {
            if(value.equals(x.data)) {
                isNode = true;
                remove(x.next);
                break;
            }
        }
        if(x == null)
            isNode = false;

        return isNode;
    }

    @Override
    public E get(int index) {
        return search(index).data;      //예외 필요없음 (search 내부에서 예외떤져줌)
    }

    @Override
    public void set(int index, Object value) {
        Node<E> setNode = search(index);
        setNode.data = null;            //그냥 해줌(직관적이자낭)
        setNode.data = (E)value;
    }

    @Override
    public boolean contains(Object value) {
        if(indexOf(value) == 1)
            return true;

        return false;
    }

    @Override
    public int indexOf(Object value) {

        for(Node<E> x = head; x != null; x = x.next) {
            if(value.equals(x.data))
                return 1;
        }
        return -1;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for(Node<E> x = head; x != null; x = x.next) {
            x.data = null;
            x.next = null;
        }
        head = tail = null;
        size = 0;
    }
}
