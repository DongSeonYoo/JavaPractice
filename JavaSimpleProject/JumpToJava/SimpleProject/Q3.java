package SimpleProject;

import java.util.Scanner;

/**
 * 3. 이번에는 양의 정수를 입력 받아 그 자릿수를 출력하는 프로그램을 작성해 보자.
 *    예를 들어 3이 입력되면 1자리수 숫자이므로 1, 25가 입력되면 2, 7876이 입력되면 4를 출력해야 한다.
 */

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int digit = 0;

        while(num != 0) {
            num /= 10;
            digit ++;
        }
        System.out.println(digit);
    }
}
