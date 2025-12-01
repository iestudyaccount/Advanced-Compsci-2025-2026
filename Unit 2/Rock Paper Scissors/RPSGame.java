import java.util.Scanner;

public class RPSGame {

    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;

    }

    // methods

    public void start() {
        Scanner playerInput = new Scanner(System.in);
        System.out.println("Please input your name: ");
        String nameInput = playerInput.nextLine();
        String choiceInput;
        System.out.println("Please input your choice: ");
        choiceInput = playerInput.nextLine();

        if (validateChoice(choiceInput) == true) {
            this.setPlayerValues(nameInput, choiceInput);
            return;
        }

        for (int i = 0; i < 2; i++) {
            choiceInput = playerInput.nextLine();
            if (validateChoice(choiceInput) == true) {
                this.setPlayerValues(nameInput, choiceInput);
                break;
            } else if (i == 1) {
                choiceInput = generateRandomChoice();
                break;
            }
        }
        this.setPlayerValues(nameInput, choiceInput);
    }

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);

    }

    public boolean didPlayerWin() {
        if (player.getChoice() == "rock") {
            if (opponent.getChoice() == "scissors") {
                return true;
            }
        } else if (player.getChoice() == "scissors") {
            if (opponent.getChoice() == "paper") {
                return true;
            }
        } else if (player.getChoice() == "paper") {
            if (opponent.getChoice() == "rock") {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String endCondition = "";
        if (didPlayerWin() == true) {
            endCondition = player.getName() + " won!"
                    + "\nCongratulations!";
        } else {
            endCondition = "Opponent won!\nBetter luck next time!";
        }
        return endCondition;
    }

    public String displayResults() {
        return "==DISPLAY RESULTS" + player.getName() + " chose "
                + player.getChoice() + ".\n Opponent chose" + opponent.getChoice()
                + toString();

    }

    // static methods

    public static boolean validateChoice(String choice) {
        if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
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