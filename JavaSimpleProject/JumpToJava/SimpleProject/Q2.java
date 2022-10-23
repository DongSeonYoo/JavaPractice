package SimpleProject;

import java.util.Scanner;

/**
 * 2. 게시판 페이징하기
 * Q: A 씨는 게시판 프로그램을 작성하고 있다.
 *그런데 게시물의 총 건수와 한 페이지에 보여 줄 게시물 수를 입력으로 주었을 때 총 페이지 수를 출력하는 프로그램이 필요하다고 한다.
 */

public class Q2 {
    static int getTotalPage(int n, int m) {
        if(n % m == 0)
            return n / m;

        else
            return (n / m) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input totalPost : ");
        int totalPost = sc.nextInt();
        System.out.println();

        System.out.print("Input page of post : ");
        int pageOfPost = sc.nextInt();
        System.out.println();

        int result = getTotalPage(totalPost, pageOfPost);

        System.out.println(result);
    }
}
