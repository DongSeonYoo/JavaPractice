public class Q4 {
    //주민등록번호 뒷자리의 맨 첫 번째 숫자는 성별을 나타낸다. 주민등록번호에서 성별을 나타내는 숫자를 출력해 보자.

    public static void main(String[] args) {
        String id = "010612-3151711";

        String sex = id.substring(7,8);

        int intSex = Integer.parseInt(sex);

        if(intSex == 1 || intSex == 3)
            System.out.println("숫자 " + intSex + "(은)는 남성입니다.");

        else if(intSex == 2 || intSex == 4)
            System.out.println("숫자 " + intSex + "(은)는 여성입니다.");
    }
}
