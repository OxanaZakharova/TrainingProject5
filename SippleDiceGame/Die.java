import java.util.Random;

public class Die {
    private int currentValue = 1;
    private int maxValue;
    private static Random randomGenerator = new Random();

    public Die(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void roll(){
        //randomGenerator = new Random();
        currentValue = randomGenerator.nextInt(maxValue)+1;
    }

    @Override
    public String toString() {
        return "Die{" +
                "currentValue=" + currentValue +
                ", maxValue=" + maxValue +
                '}';
    }
}
