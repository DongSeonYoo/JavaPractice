package ObjectOriented;

//7. 다음은 광물의 가치를 계산하는 MineralCalculator 클래스와 그 사용법이 담긴 코드이다.
// 광물 계산기는 금인 경우 100, 은인 경우 90, 구리의 경우는 80의 가치를 더하는 기능(add 메스드)이 있다.
// 하지만 이 광물 계산기는 광물이 추가될 때마다 add 메서드를 추가해야 한다는 단점이 있다.
// 광물이 추가되더라도 MineralCalculator 클래스를 변경할 필요가 없도록 코드를 수정하시오.

interface Mineral {
    public int mineralValue();
}

class Gold implements Mineral {
    @Override
    public int mineralValue() {
        return 100;
    }
}

class Silver implements Mineral {
    @Override
    public int mineralValue() {
        return 90;
    }
}

class Bronze implements Mineral {
    @Override
    public int mineralValue() {
        return 80;
    }
}

class MineralCalculator {
    private int value = 0;
    public void add(Mineral mineral) {
        this.value += mineral.mineralValue();
    }

    public int getValue() {
        return this.value;
    }
}

public class Q7 {
    public static void main(String[] args) {

        MineralCalculator calculator = new MineralCalculator();

        calculator.add(new Bronze());
        calculator.add(new Silver());
        calculator.add(new Gold());

        System.out.println(calculator.getValue());

    }
}
