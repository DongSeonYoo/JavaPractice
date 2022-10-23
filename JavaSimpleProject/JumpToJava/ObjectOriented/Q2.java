package ObjectOriented;

//2. 객체변수 value가 100 보다 큰 값은 가질 수 없도록 제한하는 MaxLimitCalculator 클래스를 만들어 보자. 즉 다음과 같이 동작해야 한다.

class MaxLimitCalculator extends Calculator {
    void add(int value) {
        this.value += value;
        if(this.getValue() > 100) {
            this.value = 100;
            System.out.println("100 을 넘어서서 max값인 100으로 초기화되었습니다.");
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        MaxLimitCalculator cal = new MaxLimitCalculator();

        cal.add(90);
        cal.add(100);
    }
}
