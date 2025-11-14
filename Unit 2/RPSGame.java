import java.util.Scanner;

public class RPSGame {

    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {

    }

    // methods

    public void start() {
        int i = 0;
        Scanner playerInput = new Scanner(System.in);
        String newInput = playerInput.nextLine();

        if (validateChoice(newInput) == false) {
            while (i < 3) {
                newInput = playerInput.nextLine();
                i++;

            }
        }

    }

    public void setPlayerValues(String name, String choice) {
        Player.setName(name);
        Player.setChoice(choice);

    }

    public boolean didPlayerWin(String name, String choice) {
        if (choice == "rock") {
            if (NPC.getChoice() == "paper") {

            }
        }
    }

    public String toString() {
        if (didPlayerWin == true) {

        }
    }

    public String displayResults() {
        System.out.println("==DISPLAY RESULTS");

    }

    // static methods

    public static boolean validateChoice(String choice) {
        if (choice == "rock" || choice == "paper" || choice == "scissors") {
            return true;
        } else {
            return false;
        }
    }

    public static String generateRandomChoice() {
        int randomChoice = (int) (Math.random() * 3);
        if (randomChoice == 1) {
            return "rock";
        } else if (randomChoice == 2) {
            return "paper";
        } else {
            return "scissors";
        }
    }
}