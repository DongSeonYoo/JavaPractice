package ObjectOriented;

import java.util.ArrayList;
import java.util.List;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int value) {
        this.value += value;
        System.out.println("add Value " + value + " ");
    }

    boolean isOdd() {       //홀수면 true, 짝수면 false
        if(this.getValue() % 2 == 0)
            return false;

        return true;
    }

    double getValue() {
        return this.value;
    }

    double getAvg(int[] array) {
        double sum = 0;
        int size = array.length;

        for(int i = 0; i < size; i++) {
            sum += array[i];
        }
        System.out.print("Array로 메서드 오버라이딩 ");
        return sum / size;
    }

    double getAvg(List<Integer> list) {

        double sum = 0;
        int size = list.size();

        for(Integer i : list) {
            sum += i;
        }
        System.out.print("List로 메서드 오버라이딩 ");
        return sum / size;
    }
}
