package DoublyLinkedList;

import Interface.List;

import java.util.NoSuchElementException;

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

        if(idx >= size || idx < 0)             //예외처리
            throw new IndexOutOfBoundsException();

        if(idx < size / 2) {                   //만약 찾으려는 인덱스가 앞쪽에있다면
            Node<E> nodeIdx = head;            //처음부터 검색(링크를 하나하나 타야하기 때문)
            for(int i = 0; i < idx; i++) {
                nodeIdx = nodeIdx.next;
            }
            return nodeIdx;
        }

        else {                                      //만약 찾으려는 값이 뒤쪽에 있다면
            Node<E> nodeIdx = tail;            //뒤쪽부터 검색
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

    public void addLast(E value) {
        Node<E> newNode = new Node<>(value);

        if(size == 0) {
            addFirst(value);
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    public boolean add(E value) {
        addLast(value);
        return true;
    }

    @Override
    public void add(int index, E value) {           //(3, 7)
        Node<E> newNode = new Node<>(value);

        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        if(index == 0) {
            addFirst(value);
            return;
        }

        if(index == size) {
            addLast(value);
            return;
        }

        Node<E> prevNode = search(index - 1);       //넣으려는 인덱스의 이전 노드
        Node<E> nextNode = prevNode.next;               //넣으려는 인덱스의 다음 노드

        prevNode.next = newNode;
        newNode.prev = prevNode;
        newNode.next = nextNode;
        nextNode.prev = newNode;
        size++;
    }

    public E remove() {          //default : 맨 앞의 노드를 삭제
        if(head == null) {
            System.out.println("헤드가 없다??????????!!!!!!???!?");
            throw new NoSuchElementException();
        }
        Node<E> nextHeadNode = head.next;
        E returnValue = head.data;

        head.data = null;               //헤드노드의데이터 삭제
        head.next = null;               //헤드 다음노드 삭제

        if(nextHeadNode != null)        //만약 헤드노드의 다음이 없다면()
            nextHeadNode.prev = null;

        head = nextHeadNode;
        size--;

        if(size == 0)
            tail = null;

        return returnValue;
    }

    @Override
    public E remove(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        if(index == 0) {
            E returnValue = head.data;
            remove();
            return returnValue;
        }

        Node<E> removedNode = search(index);
        Node<E> prevNode = removedNode.prev;
        Node<E> nextNode = removedNode.next;

        E returnValue = removedNode.data;

        removedNode.data = null;
        removedNode.prev = null;
        removedNode.next = null;

        if(nextNode != null) {      //만약 마지막노드가 삭제된것이 아니라면?
            nextNode.prev = prevNode;
            prevNode.next = nextNode;
        }
        else {                      //만약 마지막노드를 삭제한거라면?
            tail = nextNode;        //nextNode는 tail이 된다
        }

        return returnValue;
    }

    @Override
    public boolean remove(Object value) {
        Node<E> prevNode = head;
        Node<E> findNode = head;

        for(; findNode != null; findNode = findNode.next) {
            if(value.equals(findNode)) {
                break;
            }
            prevNode = findNode;
        }

        if(findNode == null)
            return false;

        if(findNode.equals(head)) {
            remove();
            return true;
        }

        else {
            Node<E> nextNode = findNode.next;

            //unlinking
            prevNode.next = null;
            findNode.data = null;
            findNode.next = null;
            findNode.prev = null;

            if(nextNode != null) {          //만약 다음노드가 존재한다면(삭제한노드가 마지막노드가 아니라면)
                nextNode.prev = prevNode;   //링크연결때려줌
                prevNode.next = nextNode;   //마찬가지
            }

            else {                          //만약 다음노드가 존재한다면(삭제한노드가 마지막노드라면)
                tail = prevNode;            //삭제한노드의 이전노드에게 tail부여
            }

            size--;
            return true;
        }
    }

    @Override
    public E get(int index) {
        return search(index).data;
    }

    @Override
    public void set(int index, E value) {
        Node<E> setNode = search(index);
        setNode.data = value;
    }

    @Override
    public boolean contains(Object value) {
        return indexOf(value) >= 0;
    }

    @Override
    public int indexOf(Object value) {
        int index = 0;

        for(Node<E> i = head; i != null; i = i.next) {
            if(value.equals(i.data)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int lastIndexOf(Object value) {
        int index = size;

        for(Node<E> i = tail; i != null; i = i.prev) {
            index--;
            if(value.equals(i.data)) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for(Node<E> i = head; i != null; i = i.next) {
            Node<E> nextNode = i.next;
            i.data = null;
            i.next = null;
            i.prev = null;
            i = nextNode;
        }
        head = tail = null;
        size = 0;
    }
}
