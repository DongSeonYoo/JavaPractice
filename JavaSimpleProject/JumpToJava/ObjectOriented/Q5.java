package ObjectOriented;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 다음 프로그램의 출력결과를 예측하고 그 이유에 대해서 설명하시오.
 * public class Sample {
 *     public static void main(String[] args) {
 *         ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
 *         ArrayList<Integer> b = a;
 *         a.add(4);
 *         System.out.println(b.size());
 *     }
 * }
 *
 *         ArrayList<Integer> b = a;
 *         이 구문에서 대입해줄경우 b는 a와 동일한 리스트 객체를 가리킨다.
 *         결론은 a 와 b는 동일한 객체이기 때문에
 *         b.size() == 4 가 된다
 */
public class Q5 {

}
