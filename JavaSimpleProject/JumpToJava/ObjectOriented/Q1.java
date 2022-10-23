package ObjectOriented;

//1. 다음처럼 Calculator 클래스를 상속하고 minus 메서드를 구현한 UpgradeCalculator 클래스를 생성한다.

class UpgradeCalculator extends Calculator {
    void minus(int value) {
        this.value -= value;
        System.out.println("minus " + value + " ");
    }
}

public class Q1 {
    public static void main(String[] args) {
        UpgradeCalculator cal = new UpgradeCalculator();

        cal.add(100);
        cal.minus(13);

        System.out.println("result = " + cal.getValue());
    }
}
