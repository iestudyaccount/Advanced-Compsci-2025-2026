public class PurrfectCare {

    String name;
    String ownerName;
    int moodLevel;
    String catId;
    char catChar;
    boolean isHungry;

    PurrfectCare(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = moodLevel;
        this.catId = catId;
        this.isHungry = true;
    }

    PurrfectCare() {
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

    }

    public boolean equals(PurrfectCare other) {
        if (this.name == other.name
                && this.ownerName == other.ownerName
                && this.moodLevel == other.moodLevel
                && this.catId == other.catId
                && this.catChar == other.catChar
                && this.isHungry == other.isHungry) {
            return true;
        } else {
            return false;
        }

    }

}