package Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements Interface.Stack {
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ARRAY = {};

    private Object[] array;
    private int size;

    public Stack() {
        this.array = EMPTY_ARRAY;
        this.size = 0;
    }

    public Stack(int capacity) {
        this.array = new Object[capacity];      //동적배열 사용
        this.size = 0;
    }

    public void resize() {
        int arrCapacity = this.array.length;


        if(Arrays.equals(array, EMPTY_ARRAY)) {     //array가 비어있다면
            array = new Object[DEFAULT_CAPACITY];   //array를 디폴트 용적으로 생성
            return;
        }

        if(this.size == arrCapacity) {              //array가 꽊차있다면
            int newSize = arrCapacity * 2;          //사이즈를 기존 사이즈보다 두배 늘려줌
            array = Arrays.copyOf(array, newSize);  //array를 두배 늘려준 사이즈로 복사시켜줌(덮어씌움)
            return;
        }

        if(this.size < (arrCapacity / 2)) {                                         //공간 낭비
            int newCapacity = (arrCapacity / 2);                                    //새로운 사이즈는 기존 사이즈의 절반
            array = Arrays.copyOf(array, Math.max(DEFAULT_CAPACITY, newCapacity));  //복사(덮어씌우기), 새로운사이즈로
            return;
        }
    }
    @Override
    public Object push(Object item) {
        if(size == array.length) {
            resize();
        }
        array[size] = item;
        size++;

        return item;
    }

    @Override
    public Object pop() {
        if(size == 0) {
            throw new EmptyStackException();
        }
        Object o = array[size - 1];

        array[size - 1] = null;
        resize();

        return o;
    }

    @Override
    public Object peek() {
        if(size == 0) {
            throw new EmptyStackException();
        }

        return array[size - 1];
    }

    @Override
    public int search(Object value) {
        if(value == null) {                             //만약 value가 null이면
            for(int idx = size - 1; idx >= 0; idx--) {
                if(array[idx] == null)                  //nullptrexeption을 방지하기 위해 ==으로 검사
                    return size - idx;
            }
        }

        else {
            for(int idx = size - 1; idx >= 0; idx--) {
                if(array[idx].equals(value)) {
                    return size - idx;
                }
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        for(int i = 0; i < size; i++)
            array[i] = null;

        size = 0;
        resize();
    }

    @Override
    public boolean empty() {
        return size == 0;
    }
}
