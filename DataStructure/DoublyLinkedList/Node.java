package DoublyLinkedList;

public class Node<E> {
    E data;
    Node<E> next;           //다음 노드를 가리키는 변수
    Node<E> prev;           //이전 노드를 가리키는 변수

    Node(E data) {          //노드 생성(초기화)
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}