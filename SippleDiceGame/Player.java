import java.util.ArrayList;

public class Player {
    private String name;
    private int point = 0;
    public ArrayList<Die> dices = new ArrayList<>();

    public Player(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    public void rollDice() {
        for (Die die : dices) {
            die.roll();
        }
    }

    public void printDice(){
        System.out.print("Values on the dices: ");
        for (Die die : dices){
            System.out.print(die.getCurrentValue()+" ");
        }
        System.out.println();
    }

    public int getDieValue() {
        int sum = 0;
        for (Die die : dices){
            sum += die.getCurrentValue();
        }
        return sum;
    }

    public void increaseScore() {
        point++;
    }

    public void addDie(int sides) {
        dices.add(new Die(sides));
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", point=" + point +
                ", dices=" + dices +
                '}';
    }
}


