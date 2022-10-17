package Interface;

public interface List<E> {
    public boolean add(E value);           //리스트에 요소를 추가.

    public void add(int index, E value);   //firstParam(index) 에 secondParam(value)를 삽입.

    E remove(int index);            //firstParam(index)위치에 있는 요소를 삭제 후 삭제된 요소를 반환함.

    boolean remove(Object value);   //특정 요소를 삭제. 만약 동일한 요소가 있다면 앞에있는 요소를 삭제함.

    E get(int index);               //firstParam(index)에 있는 요소를 반환.

    void set(int index, E value);   //firstParam(index)위치에 있는 요소를 secondParam(value) 요소로 대체.

    boolean contains(Object value); //특정 요소가 리스트 내부에 존재하는지 반환해줌.

    int indexOf(Object value);      //특정 요소가 존재하는 인덱스를 반환해줌

    int size();                     //리스트에 있는 요소의 개수를 리턴.

    boolean isEmpty();              //리스트가 비어있으면 true, 하나라도 존재하면 true

    public void clear();            //리스트에 있는 요소를 모두 삭제
}