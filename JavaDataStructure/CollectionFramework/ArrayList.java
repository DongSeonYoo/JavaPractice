package CollectionFramework;
import InterfacePackage.List;

import java.util.Arrays;

public class ArrayList<E> implements List<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_CAPACITY = {};

    private int size;

    Object[] array;

    public ArrayList() {                    //ArrayList<Object> arrayList = new ArrayList<>(), 즉 생성만 했을 경우
        this.array = EMPTY_CAPACITY;        //빈 배열로 초기화.
        this.size = 0;                      //사이즈 초기화
    }

    public ArrayList(int capacity) {        //ArrayList<Object> arrayList = new ArrayList(capacity), 사이즈 초기화 해줬을 경우
        this.array = new Object[capacity];  //param으로 capacity 설정 후 객체 생성
        this.size = 0;                      //사이즈 초기화.
    }

    private void resize() {                         //reAlloCation,
        int arrayCapacity = array.length;

        if(Arrays.equals(array, EMPTY_CAPACITY)) {  //capacity가 0일 경우
            array = new Object[DEFAULT_CAPACITY];   //디폴트 용량(10)으로 초기화
            return;
        }

        if(size == arrayCapacity) {                 //데이터가 꽉찬경우
            int newCapacity = arrayCapacity * 2;    //새로운 capacity는 원본 capacyty에 * 2

            array = Arrays.copyOf(array, newCapacity);  //이후 새로운 배열에 copy
            return;
        }

        if(size < (arrayCapacity / 2)) {            //데이터가 절반 이하인 경우 (메모리 낭비)
            int newCapacity = arrayCapacity / 2;    //원본 capacity / 2   (자원절약을 위해)

            array = Arrays.copyOf(array, Math.max(newCapacity, DEFAULT_CAPACITY));  //이후 복사
        }
    }

    @Override
    public boolean add(E value) {
        addLast(value);
        return true;
    }

    private void addLast(E value) {
        if(size == array.length)    //꽉 차있을 경우엔?
            resize();               //reAllocation
        array[size] = value;
        size++;
    }

    @Override
    public void add(int index, E value) {

        if(index > size || index < 0) {     //index가 잘못입력되었을 경우
            throw new ArrayIndexOutOfBoundsException(); //예외 던지기
        }
        if(index == size) {         //addindex가 마지막 위치면 addLast로 요소를 추가한다.
            addLast(value);
        }
        else {

            if(size == array.length) {
                resize();
            }

            for(int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }

            array[index] = value;
            size++;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public E remove(int index) {
        if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        E element = (E)array[index];
        array[index] = null;

        //삭제한 요소의 뒤에 있는 요소를 한 칸씩 앞으로 당겨옴
        for(int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
            array[i + 1] = null;
        }
        size--;
        resize();
        return element;
    }

    //1. arrayList 안에 value가 존재하는지?
    //2. 존재한다면 몇번 째 위치에 존재하는지?
    //3. 삭제 이후 나머지 뒤에 있는 요소들을 한 칸씩 앞으로 당긴다.
    @Override
    public boolean remove(Object value) {
        int index = indexOf(value);

        if(index == -1) {
            return false;
        }
        remove(index);
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (E)array[index];
    }

    @Override
    public void set(int index, E value) {
        if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        else {
            array[index] = value;
        }
    }

    @Override
    public boolean contains(Object value) {

        if(indexOf(value) != -1) {
            return true;
        }

        return false;
    }

    @Override
    public int indexOf(Object value) {
        for(int i = 0; i < size; i++) {
            if(array[i].equals(value)) {
                return i;
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
        return size == 0;       //요소가 0개일 경우 비어있는것이므로 true 반환
    }

    @Override
    public void clear() {

        for(int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
        resize();
    }
}
