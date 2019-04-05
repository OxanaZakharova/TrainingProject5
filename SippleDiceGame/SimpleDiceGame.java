import java.util.ArrayList;
import java.util.Scanner;

public class SimpleDiceGame {
    public static void main(String[] args) {
        ArrayList<Player> players;// = new ArrayList<>();
        players = initialize();
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            System.out.println("Round number "+i);
            takeTurn(players);
        }

        System.out.println("Winners:");
        for (Player player : getWinners(players)){
            System.out.println(player.getName());
        }


    }

    private static ArrayList<Player> initialize () {
        int numberOfPlayers;
        int numberOfDice;
        int numberOfSides;
        ArrayList<Player> players = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many players want to play? ");
        numberOfPlayers = sc.nextInt();
        System.out.println("How many dice each player should have? ");
        numberOfDice = sc.nextInt();
        System.out.println("How many sides the dice should have? ");
        numberOfSides = sc.nextInt();
        System.out.println("Enter names of " + numberOfPlayers + " players");

        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player(sc.next(), 0));
            for (int j = 0; j < numberOfDice ; j++) {
                players.get(i).addDie(numberOfSides);
            }
        }

        System.out.println(players.toString());
        return  players;
    }

    private static void takeTurn(ArrayList<Player> players){
        int guessingSum;


        for (Player player : players){
            System.out.println();
            System.out.println("The player "+ player.getName() + " is playing!");
            System.out.println("Guess the sum of dices!" );
            Scanner sc = new Scanner(System.in);
            guessingSum = sc.nextInt();
            System.out.println("Your guess is " + guessingSum);
            System.out.print("Dices are rolling and the sum is.... ");
            player.rollDice();
            int sum = player.getDieValue();
            System.out.println(sum);
            player.printDice();

            if (sum == guessingSum){
                System.out.println("Congratulations! You are right! You got one point!");
                player.increaseScore();
            } else {
                System.out.println("You didnt guess!Try the next time!");
            }

        }

    }

    private static  ArrayList<Player> getWinners(ArrayList<Player> players){
        int maxPoint = 0;
        for (Player player : players){
            if (player.getPoint() > maxPoint){
                maxPoint = player.getPoint();
            }
        }
        System.out.println("(MaxPoint = " + maxPoint + ")");
        ArrayList<Player> winners = new ArrayList<>();
        for (Player player : players){
            if (player.getPoint() == maxPoint){
                winners.add(player);
            }
        }
        return winners;
    }

}
