public class Player {
    private String name;
    private int totalScore = 0;
    public Die die;

    public Player(String name, int totalScore, Die die) {
        this.name = name;
        this.totalScore = totalScore;
        this.die = die;
    }

    public String getName() {
        return name;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int rollDie() {
        return die.roll();
    }

    public void increaseTotalScore(int points) {
        totalScore += points;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", totalScore=" + totalScore +
                ", dies=" + die +
                '}';
    }
}
