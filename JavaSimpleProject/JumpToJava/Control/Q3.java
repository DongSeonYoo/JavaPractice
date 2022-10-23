package Control;

public class Q3 {
    //3.while문 또는 for 문을 사용하여 다음과 같이 별(*)을 표시하는 프로그램을 작성해 보자.
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
