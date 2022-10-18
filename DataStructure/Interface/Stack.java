package Interface;

public interface Stack<E> {

    E push(E item);             //요소를 삽입

    E pop();                    //스택에서 요소를 제거

    E peek();                   //맨 위에있는 요소를 제거하지 않고 반환함.

    int search(Object value);   //요소가 있는지 검사하고 인덱스를 리턴

    int size();                 //스택의 크기를 리턴

    void clear();               //스택의 모든 요소를 제거(빈 스택으로 만들꺼임)

    boolean empty();            //스택이 비어있는지 검사(비어있으면? True : False)
}
