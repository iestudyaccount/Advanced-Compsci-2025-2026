public class Cat {
    private String name;
    private String breed;
    private boolean isHungry;
    private int livesRemaining;

    // 1. Fixed to be 2-Parameter Constructor
    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.isHungry = true;
        livesRemaining = 9;
    }

    // getters

    // 2. Added getBreed, getLivesRemaining

    public String getBreed() {
        return breed;
    }

    // 2.a changed from void to String

    public String getName() {
        return name;
    }

    // 2.b Changed from void to boolean

    public boolean getIsHungry() {
        return isHungry;
    }

    public int getLivesRemaining() {
        return livesRemaining;
    }

    // setters

    // 3. Added setBreed, setLives Remaining

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLivesReimaining(int livesRemaining) {
        this.livesRemaining = livesRemaining;
    }

    // methods

    // 4. fixed public boolean feed to return false

    public boolean feed() {
        return this.isHungry = false;
    }

    // 5. Fixed formatting on the equals method

    public boolean equals(Cat other) {
        if (this.name.equals(other.name)
                && this.breed.equals(other.breed)
                && this.livesRemaining == other.livesRemaining) {
            return true;
        }
        return false;
    }

    public String toString() {
        return (name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.");
    }
}