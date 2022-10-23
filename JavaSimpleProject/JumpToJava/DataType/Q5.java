package DataType;

public class Q5 {

    //5: 다음과 같은 문자열 a:b:c:d가 있다. 문자열의 replace 함수를 사용하여 a#b#c#d로 바꿔서 출력해 보자.

    public static void main(String[] args) {
        String abcd = "a:b:c:d";

        String replaceAbcd = abcd.replaceAll(":", "#");

        System.out.println(replaceAbcd);
    }
}
