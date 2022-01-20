import java.util.Random;
import java.util.Scanner;

public class Display {

    String yourName;
    String choice;
    Random random = new Random();
    String confirmation;
    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    int compMove;
    int yourScore = 0;
    int compScore = 0;
    int roundNumber = 1;
    int howManyWins;

    public void displayMainMenu() {
        System.out.println("Welcome, in Rock, Paper, Scissors game");
        System.out.println("What's your name?");
        yourName = scanner.nextLine();
        System.out.println("Hello " + yourName + " " + "For how many wins do you want to play?");
        howManyWins = scanner.nextInt();
        System.out.println("Good luck you decided to play for: " + howManyWins + " wins");
        System.out.println("What do you want to do?, please use your keyboard to choose one option");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        System.out.println("x - close window");
        System.out.println("n - new game");
        choice = scanner2.nextLine();

    }

    public void afterMainMEnuDisplay() {



        if (choice.equals("x")) {
            System.out.println("Do you really want to finish game? y/n");
            confirmation = scanner.nextLine();
            if (confirmation.equals("y")) {
                System.out.println("See you next time");
            } else if (confirmation.equals("n")) {
                displayMainMenu();
            } else {
                System.out.println("Wrong choice try again");
                displayMainMenu();
            }
        } else if (choice.equals("n")) {
            System.out.println("Do you really want to finish game and start new one? y/n");
            confirmation = scanner.nextLine();
            if (confirmation.equals("y")) {
                System.out.println("OK let's start again");
            } else if (confirmation.equals("n")) {
                displayMainMenu();
            } else {
                System.out.println("Wrong choice try again");
                displayMainMenu();
            }
        } else {

            comparator();
            System.out.println("Round number: " + roundNumber + " ||||| your score " + yourScore + " ||||||  -  comp score: " + compScore);
            System.out.println("You're playing to " + howManyWins + "  wins");
            roundNumber++;
        }
    }

    public void comparator() {
        compMove = random.nextInt(2);
        if (choice.equals("1") && compMove == 0) {
            System.out.println("Rock vs Rock, it's a draw");
        } else if (choice.equals("1") && compMove == 1) {
            System.out.println("Rock vs Paper, you lost");
            compScore++;
        } else if (choice.equals("1") && compMove == 2) {
            System.out.println("Rock vs Scissors, you won");
            yourScore++;
        } else if (choice.equals("2") && compMove == 0) {
            System.out.println("Paper vs Rock, you won");
            yourScore++;
        } else if (choice.equals("2") && compMove == 1) {
            System.out.println("Paper vs Paper, it's a draw");
        } else if (choice.equals("2") && compMove == 2) {
            System.out.println("Paper vs Scissors, you lost");
            compScore++;
        } else if (choice.equals("3") && compMove == 0) {
            System.out.println("Scissors vs Rock you lost");
            compScore++;
        } else if (choice.equals("3") && compMove == 1) {
            System.out.println("Scissors vs Paper, you won");
            yourScore++;
        } else if (choice.equals("3") && compMove == 2) {
            System.out.println("Scissors vs Scissors, it's a draw");
        }
    }

    public void finalScoreChecker() {
        if (yourScore == howManyWins) {
            System.out.println("Congratulations you Won this battle " + yourScore + " : " + compScore);
        } if (compScore == howManyWins) {
            System.out.println("Unfortunately you lost this battle " + yourScore + " : " + compScore);
        }
    }
}
