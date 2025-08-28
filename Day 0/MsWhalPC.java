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

    public void rename() {
        firstLetterOfComputer = 'J';
        System.out.println("The computer has been renamed to John.");
        System.out.println("The first letter is: " + firstLetterOfComputer);
    }

    public void takeOff() {
        isThereBird = false;
        System.out.println("The Bird is no longer :[");
    }

    public void putBack() {
        isThereBird = true;
        System.out.println("THE BIRD HAS RISEN!!!!!! :]");
    }

    public void wreck() {
        numberOfCords = 0;
        System.out.println("The number of cords left are:");
        System.out.println(numberOfCords);
    }

    public void replug() {
        numberOfCords = 4;
        System.out.println("The number of cords returned are: ");
        System.out.println(numberOfCords);
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
        System.out.print("Ms. What has signed in to her PC.");
    }
}