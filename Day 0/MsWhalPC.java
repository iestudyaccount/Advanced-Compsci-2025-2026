public class MsWhalPC{
    //Bird on it
    //Is an all-in-one
    //4 cords coming out the back
    //Swivels from side to side
    //Rectangular

    private int numberOfCords; // = 4;
    private boolean isThereBird; // = true;
    private String typeOfPc; // = "All-In-One";
    private double degreesSwiveled; // = 120.5;
    private char firstLetterOfComputer; // = 'C';
    private boolean loggedIn;
    private double artificialIntelligence;

    public MsWhalPC() {
        numberOfCords = 4;
        isThereBird = true;
        typeOfPc = "All-In-One";
        degreesSwiveled = 120.5;
        firstLetterOfComputer = 'C';
        loggedIn = true;
    }

    // public __WhatComesOut__ _nameOfFunction_(_inputs_) {

    //}

    public MsWhalPC(String typeOfPcAndColor, char firstLetterOfComputer){
        typeOfPc = typeOfPcAndColor;
    }

    public String toString() {
        return "This clock has " + numberOfCords 
        + " number of cords, and is an " + typeOfPc 
        + ". The monitor is angled at " + degreesSwiveled
        + ". Is Ms. Whal logged in? " + loggedIn 
        + ", and is there a bird on her monitor? " + isThereBird
        + " Finally, what is the first letter in the word computer?: " + firstLetterOfComputer;
    }

    public void rename() {
        firstLetterOfComputer = 'J';
        System.out.println("The computer has been renamed to John.");
        System.out.println("The first letter is: " + firstLetterOfComputer);
    }

    public void isBirdOn() {
        if(isThereBird)
        {
            System.out.println("There is bird!");
        }
        else
        {
            System.out.println("Bird is gone :(");
        }
    }

    public void putBack() {
        if(isThereBird == false) {
            isThereBird = true;
            System.out.println("Bird is back. :)");
        }
    }

    public void wreck() {
        numberOfCords = 0;
        System.out.println("The number of cords left are:");
        System.out.println(numberOfCords);
    }

    public void takeAway(int cordsToTake) {
        if (cordsToTake > numberOfCords) {
            System.out.println("You can't take out that many cords");
            numberOfCords = 0;
        }
        else{
            numberOfCords = numberOfCords - cordsToTake;
        }
        if (numberOfCords == 0) {
            System.out.println("There are no more cords to take.");
        }
    }

    public void swivel() {
        degreesSwiveled = 170.5;
        System.out.println("The monitor turned to the right, the degree is now ");
        System.out.println(degreesSwiveled);
    }

    public void replace() {
        typeOfPc = "Desktop";
        System.out.println("The old PC broke, the new one is a " + typeOfPc);
    }

    public void signOut() {
        loggedIn = false;
        System.out.println("Ms. Whal has signed out of her PC.");
    }

    public void signIn() {
        loggedIn = true;
        System.out.print("Ms. Whal has signed in to her PC.");
    }

    public boolean equals(MsWhalPC msCoxPC) {
        if (
            this.isThereBird == msCoxPC.isThereBird &&
            this.numberOfCords == msCoxPC.numberOfCords &&
            this.degreesSwiveled == msCoxPC.degreesSwiveled &&
            this.typeOfPc.equals(msCoxPC.typeOfPc) &&
            this.firstLetterOfComputer == msCoxPC.firstLetterOfComputer
        ){
            return true;
        }
        return false;
    }

    public boolean getIsThereBird() {
        return this.isThereBird;
    }

    public void setIsThereBird(boolean isThereBird) {
        this.isThereBird = isThereBird;
    }

    public int getNumberOfCords() {
        return this.numberOfCords;
    }

    public void setNumberOfCords(int numberOfCords) {
        this.numberOfCords = numberOfCords;
    }

    public String getTypeOfPc() {
        return this.typeOfPc;
    }
    
    public void setTypeOfPc(String typeOfPc) {
        this.typeOfPc = typeOfPc;
    }

    public char getFirstLetterOfComputer() {
        return this.firstLetterOfComputer;
    }

    public void setFirstLetterOfComputer(char firstLetterOfComputer) {
        this.firstLetterOfComputer = firstLetterOfComputer;
    }

    public double getDegreesSwiveled() {
        return this.degreesSwiveled;
    }

    public void setDegreesSwiveled(double degreesSwiveled) {
        this.degreesSwiveled = degreesSwiveled;
    }

    public boolean getLoggedIn() {
        return this.loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    private double setArtificalIntelligence(int iq) {
        this.artificialIntelligence = Math.sqrt(iq);
    }
}