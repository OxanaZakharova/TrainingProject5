import java.util.ArrayList;
import java.util.Scanner;

public class PigGame {
    public static boolean gameContinue = true;

    public static void main(String[] args) {
        ArrayList<Player> players;
        players = initialize();

        do {
            takeTurn(players);
        }while (gameContinue);

        for (Player player :  players){
            System.out.println("TotalScore of player " + player.getName() +  "= " + player.getTotalScore());
        }


    }

    private static ArrayList<Player> initialize () {
        int numberOfPlayers;
        Die die = new Die();
        ArrayList<Player> players = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many players want to play? ");
        numberOfPlayers = sc.nextInt();
        System.out.println("Enter names of " + numberOfPlayers + " players");

        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player(sc.next(), 0, die));
        }

        System.out.println(players.toString());
        return  players;
    }



    private static void takeTurn(ArrayList<Player> players){
        int turnScore;
        int maxScore = 60;
        String answer;
        int currentValue;
        int preliminaryResult = 0;

        for (Player player : players){
            turnScore = 0;
            System.out.println();
            System.out.println("The player "+ player.getName() + " is playing!");
            do {
                System.out.print("The die is rollind and the value is...");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
                currentValue = player.rollDie();
                System.out.println(currentValue);
                if (currentValue == 1){
                    System.out.println("The value is 1, you dont get any points!");
                    turnScore = 0;
                    break;
                }
                turnScore += currentValue;
                preliminaryResult = player.getTotalScore()+turnScore;
                System.out.println("(PreliminaryResult: " + preliminaryResult + ")");

                System.out.println("Do you want to stop? (yes/no) ");
                Scanner sc = new Scanner(System.in);
                answer = sc.next();
            } while (!answer.equals("yes"));

            player.increaseTotalScore(turnScore);
            System.out.println("TotalScore of player " + player.getName() + " is " + player.getTotalScore());
            if (player.getTotalScore() >= maxScore){
                gameContinue = false;
                System.out.println("Congratulations! The player " + player.getName() + " got  maxPoints! It is the winner!!!");
                break;
            }

        }


    }


}
