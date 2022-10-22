import java.util.HashMap;

public class Q8 {
    //8. 다음의 맵 grade에서 "B'에 해당되는 값을 추출해 보자. (추출하고 나면 grade에는 "B"에 해당하는 아이템이 사라져야 한다.)

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("A", 90);
        hashMap.put("B", 80);
        hashMap.put("C", 70);

        System.out.println("Before : " + hashMap);

        int result = hashMap.remove("B");

        System.out.println("remove : " + result);
        System.out.println("after : " + hashMap);

    }
}
