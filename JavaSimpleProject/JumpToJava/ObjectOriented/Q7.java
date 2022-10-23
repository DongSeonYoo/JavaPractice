package ObjectOriented;

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

}

public class Q7 {

}
