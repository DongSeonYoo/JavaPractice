package SimpleProject;

import java.util.Scanner;

/**
 * 4. 이번에는 어떠한 문자열을 입력받았을때 공백을 제외한 글자수만을 리턴하는 코드를 작성해 보자
 *    즉, 어떤 문자열이 "공백을 제외한 글자수"라면 띄어쓰기를 위해 필요한 공백 문자 2개를 제외하고 9라는 숫자를 리턴해야 한다.
 */

public class Q4 {
    public static int getWithOutWhiteSpace(String str) {
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ')
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.nextLine();
        System.out.println(getWithOutWhiteSpace(inputStr));
    }
}
