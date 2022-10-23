package Control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5 {
    //5. A 학급에 총 10명의 학생이 있다. 이 학생들의 중간고사 점수는 다음과 같다.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(70, 60, 55, 75, 95, 90, 80, 80, 85, 100));
        int sum = 0;
        int size = list.size();


        for(int i : list) {
            sum += i;
        }
        System.out.println((double) sum / size);
    }
}
