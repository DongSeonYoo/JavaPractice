package DataType;

import java.util.*;

public class Q9 {
    //9. 다음의 numbers 리스트에서 중복 숫자를 제거해 보자.

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6));
        Set<Integer> removeFreq = new HashSet<>(nums);

        System.out.println("before : "  + nums);

        List<Integer> result = new ArrayList<>(removeFreq);

        System.out.println("After : " + result);
    }
}
