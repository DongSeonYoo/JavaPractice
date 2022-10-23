package ObjectOriented;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//4. 다음 클래스에 정수 배열 또는 정수의 리스트 입력시 그 평균값을 구해 정수로 리턴하는 avg 메서드를 추가해 보자.
public class Q4 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        Calculator cal = new Calculator();

        double arrayResult = cal.getAvg(array);
        System.out.println(arrayResult);

        double listResult = cal.getAvg(arrayList);
        System.out.println(listResult);
    }
}
