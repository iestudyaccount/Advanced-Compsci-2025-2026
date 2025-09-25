public class Bank {

    private int numberOfTellers;
    private int numberOfLoanOfficers;

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    // getters

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    // setters

    public void setNumberOfTellers(int newNumTellers) {
        numberOfTellers = newNumTellers;
    }

    public void setNumberOfLoanOfficers(int newNumLoanOfficers) {
        numberOfLoanOfficers = newNumLoanOfficers;
    }

    // methods

    public int computeTotalEmployees() {
        int allEmployees;
        allEmployees = numberOfTellers + numberOfLoanOfficers;
        return allEmployees;

    }

    public String toString() {
        return "This bank has "
                + numberOfLoanOfficers + " Loan Officers "
                + " and " + numberOfTellers + " Tellers.";

    }

    public boolean equals(Bank otherBank) {
        if (this.numberOfTellers == otherBank.numberOfTellers
                && this.numberOfLoanOfficers == otherBank.numberOfLoanOfficers) {
            return true;
        }
        return false;
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer == true) {
            numberOfLoanOfficers = numberOfLoanOfficers + numberToHire;

        } else {
            numberOfTellers = numberOfTellers + numberToHire;
        }

    }

    // Stretch Goal

    public String getEmployeeRatio() {
        return "For every " + numberOfTellers + " Tellers there are "
                + numberOfLoanOfficers + " Loan Officers";
    }

    public void fireMembers(int numberToFire, boolean isLoanOfficer) {
        if (numberToFire <= numberOfLoanOfficers && isLoanOfficer == true) {
            numberOfLoanOfficers = numberOfLoanOfficers - numberToFire;
        } else if (numberToFire <= numberOfTellers && isLoanOfficer == false) {
            numberOfTellers = numberOfTellers - numberToFire;
        } else {
            System.out.println("You can't fire that many people!");
        }
    }

    public int transferEmployee(boolean fromLoanOfficer) {
        if (fromLoanOfficer == true) {
            numberOfLoanOfficers = numberOfLoanOfficers + 1;
            numberOfTellers = numberOfTellers + 1;
        } else {
            numberOfTellers = numberOfTellers - 1;
            numberOfLoanOfficers = numberOfLoanOfficers + 1;
        }

        return numberOfTellers;
    }

    public int totalSalaries(int totalTellerSalaries, int totalLoanOfficerSalaries) {
        int loanOfficerSalary = 75000;
        int tellerSalary = 45000;

        totalTellerSalaries = totalTellerSalaries * tellerSalary;
        totalLoanOfficerSalaries = totalLoanOfficerSalaries + loanOfficerSalary;

        return totalTellerSalaries;
    }

}
