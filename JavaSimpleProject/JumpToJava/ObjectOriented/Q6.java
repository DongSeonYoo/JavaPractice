package ObjectOriented;

/**
 * 다음은 Calculator 객체를 생성하고 값을 더한 후에 그 결과값을 출력하는 예제이다.
 * 하지만 코드를 실행하면 오류가 발생한다. Calculator 클래스를 수정하여 다음의 코드에서 오류가 발생하지 않도록 하시오.
 * class Calculator {
 *     Integer value;             <- Integer는 값을 대입하지 않으면 Null이기때문에
 *
 *     void add(int val) {
 *         this.value += val;
 *     }
 *
 *     public Integer getValue() {
 *         return this.value;
 *     }
 * }
 *
 * public class Sample {
 *     public static void main(String[] args) {
 *         Calculator cal = new Calculator();
 *         cal.add(3);  // Null에 접근하니 당연히 NullPointExeption 발생
 *         System.out.println(cal.getValue());
 *     }
 * }
 *
 * after Refactor
 * Calculator() {
 *     this.value = 3;          생성자를 이용해서 값을 초기화해주던가
 * }
 *
 */

public class Q6 {

}
