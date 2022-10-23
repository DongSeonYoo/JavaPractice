package DataType;

public class Q3 {
    //3. 유동선씨의 주민등록번호는 010612-3151711이다. 홍길동씨의 주민등록번호를 연월일(YYYYMMDD) 부분과 그 뒤의 숫자 부분으로 나누어 출력해 보자.
    public static void main(String[] args) {

        String id = "010612-3151711";
        String yyyymmdd = id.substring(0, 6);
        String back = id.substring(7);

        System.out.println("앞자리 : " + yyyymmdd);
        System.out.println("뒷자리 : " + back);
    }
}
