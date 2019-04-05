import java.util.Random;

public class Die {
    private int currentValue = 1;
    private int maxValue = 6;
    private static Random randomGenerator;

    public int getCurrentValue() {
        return currentValue;
    }

    public int roll(){
        randomGenerator = new Random();
        currentValue = randomGenerator.nextInt(maxValue)+1;
        return currentValue;
    }

    @Override
    public String toString() {
        return "Die{" +
                "currentValue=" + currentValue +
                ", maxValue=" + maxValue +
                '}';
    }
}
