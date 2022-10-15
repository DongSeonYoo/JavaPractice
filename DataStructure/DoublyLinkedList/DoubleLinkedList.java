package DoublyLinkedList;

import Interface.List;

public class DoubleLinkedList<E> implements List<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private Node<E> search(int idx) {

        if(idx <= this.size || idx < 0)             //예외처리
            throw new IndexOutOfBoundsException();

        if(idx < this.size / 2) {                   //만약 찾으려는 값이 앞쪽에있다면
            Node<E> nodeIdx = this.head;            //처음부터 검색(링크를 하나하나 타야하기 때문)
            for(int i = 0; i < idx; i++) {
                nodeIdx = nodeIdx.next;
            }
            return nodeIdx;
        }

        else {                                      //만약 찾으려는 값이 뒤쪽에 있다면
            Node<E> nodeIdx = this.tail;            //뒤쪽부터 검색
            for(int i = size - 1; i > idx; i--) {
                nodeIdx = nodeIdx.prev;
            }
            return nodeIdx;
        }
    }

    public void addFirst(E value) {
        Node<E> newNode = new Node<>(value);

        if(head != null)        //head가 존재한다면
            head.prev = newNode;//head의 prev는 newNode를 가리킨다.

        head = newNode;         //newNode는 head가 되고
        size++;                 //size증가

        if(head.next == null)   //만약 head의 다음노드가 없다면(head가 유일한 노드라면)
            tail = head;        //head가 곧 tail이다.
    }

    public boolean add(E value) {

        return false;
    }

    @Override
    public void add(int index, E value) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public boolean remove(Object value) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void set(int index, E value) {

    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}
