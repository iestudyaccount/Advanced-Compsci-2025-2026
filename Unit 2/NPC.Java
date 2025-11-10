public class NPC {

    private String choice; 
    public NPC() {
        this.choice = RPSGame.generateRandomChoice();
    }

    // getters and setters

    public String getChoice() {
        return this.choice;

    }

    public void setChoice() {
        this.choice = choice.toLowerCase();
        if (RPSGame.validateChoice(this.choice) == true) {
        } else {
            this.choice = RPSGame.generateRandomChoice();
        }
    }

    // methods

    public String toString() {
        return "Opponent chose " + choice + ".";
    }
}