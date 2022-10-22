public class Q2 {
     // 02. 자연수 13이 홀수인지 짝수인지 판별할 수 있는 방법에 대해서 말해 보자.
    public static String isOddNum(int num) {
        String answer = "";
        if(num % 2 == 0)
            answer = "Not Odd num";
        else
            answer = "Is Odd num";

        return answer;
    }

    public static void main(String[] args) {
        int num = 13;

        System.out.println(isOddNum(num));
    }
}
