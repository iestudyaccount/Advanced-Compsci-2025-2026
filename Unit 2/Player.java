public class Player {

    private String name;
    private String choice;

    // getters

    public String getName() {
        return this.name;
    }

    public String getChoice() {
        return this.choice;
    }

    // setters

    public void setName() {
        this.name = name;
    }

    public void setChoice() {
        this.choice = choice.toLowerCase();
        if (RPSGame.validateChoice(this.choice) == true) {
        } else {
            this.choice = RPSGame.generateRandomChoice();
        }
    }

    public String toString() {
        return name + " chose " + choice + ".";
    }

}
