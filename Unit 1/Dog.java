public class Dog {

    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    Dog(String name, String owerName, int age, int dogId) {
        this.name = name;
        this.ownerName = owerName;
        this.age = age;
        this.dogId = dogId;
        this.dogTag = PawsomeUtils.generateDogTag(this.dogId, this.dogChar);
    }

    Dog() {
        this.name = "Barkley";
        this.ownerName = "Jessica";
        this.age = 2;
        this.dogId = 696;
        this.dogTag = PawsomeUtils.generateDogTag(this.dogId, this.dogChar);
    }

    // getters

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getAge() {
        return age;
    }

    public int getDogId() {
        return dogId;
    }

    public char getDogChar() {
        return dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public boolean getStillInFacility() {
        return stillInFacility;
    }

    // setters

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    // methods

    public String toString() {
        return name + " is a good dog. They are " + age + " years old and belong to " + ownerName
                + ". They are currently in our facility. For employee use only: DogTag is " + dogTag + ".";
    }

    public boolean equals(Dog other) {
        if (this.name == other.name
                && this.ownerName == other.ownerName
                && this.age == other.age
                && this.dogId == other.dogId
                && this.dogChar == other.dogChar
                && this.dogTag == other.dogTag
                && this.stillInFacility == other.stillInFacility) {
            return true;
        }
        return false;
    }
}