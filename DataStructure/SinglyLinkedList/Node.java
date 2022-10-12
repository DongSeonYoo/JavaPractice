package SinglyLinkedList;

public class Node<E> {
    E data;
    Node<E> next;       //다음 노드 객체를 가리키는 변수
    Node(E data) {
        this.data = data;
        this.next = null;
    }
}
