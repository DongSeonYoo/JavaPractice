import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q7 {

    //7. ['Life', 'is', 'too', 'short'] 라는 리스트를 Life is too short라는 문자열로 만들어 출력해 보자.
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("Life", "Is", "Too", "Short"));

        String str = String.join(" ", stringList);

        System.out.println(str);
    }
}
