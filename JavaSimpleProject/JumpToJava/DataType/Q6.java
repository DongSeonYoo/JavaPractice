import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q6 {

    //6. [1, 3, 5, 4, 2]라는 리스트를 [5, 4, 3, 2, 1]로 만들어보자.
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));

        integerList.sort(Comparator.naturalOrder());
        System.out.println("오름차순 : " + integerList);

        integerList.sort(Comparator.reverseOrder());
        System.out.println("내림차순 : " + integerList);

    }
}
