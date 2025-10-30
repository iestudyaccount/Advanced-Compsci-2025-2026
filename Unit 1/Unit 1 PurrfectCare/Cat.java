public class Cat {

    String name;
    String ownerName;
    int moodLevel;
    String catId;
    char catChar;
    boolean isHungry;

    Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = moodLevel;
        this.catId = catId;
        this.isHungry = true;
    }

    Cat() {
        this.name = "Garfield";
        this.ownerName = "Jon";
        this.moodLevel = 5;
        this.catId = catId;
        this.isHungry = true;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public String getCatId() {
        return catId;
    }

    public char getCatChar() {
        return catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    // methods

    public String catTag() {
        return "" + catId + catChar;
    }

    public String toString() {
        return "==ABOUT " + name + "=="
        + name + " is a cat. \nTheir tag "
        + "is " + _ + ".\nCurrently, " 
        + name + " is in a " +

    }

    public boolean equals(Cat other) {
        if (this.name.equals(other.name)
                && this.ownerName.equals(other.ownerName)
                && this.moodLevel == other.moodLevel
                && this.catId.equals(other.catId)
                && this.catChar == other.catChar
                && this.isHungry == other.isHungry) {
            return true;
        } else {
            return false;
        }

    }

}