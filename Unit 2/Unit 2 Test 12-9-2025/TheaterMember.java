public class TheaterMember {

    // private instance variables

    private String name;
    private boolean[] loyaltyCredits;

    // constructor

    public TheaterMember(String name) {
        this.name = name;
        this.loyaltyCredits = new boolean[10];
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    // methods

    public void grantLoyaltyCredit() {
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == false) {
                loyaltyCredits[i] = true;
                return;
            }
        }
    }

    public int countLoyaltyCredits() {
        int creditCounter = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                creditCounter++;
            }
        }
        return creditCounter;
    }

    public String determineMembershipStatus() {
        String membershipStatus;
        if (countLoyaltyCredits() >= 6) {
            membershipStatus = "Gold Member";
        } else if (countLoyaltyCredits() >= 3 && countLoyaltyCredits() <= 5) {
            membershipStatus = "Silver Member";
        } else {
            membershipStatus = "Plus Member";
        }
        return membershipStatus;
    }

    public String loyaltyHistory() {
        String[] loyaltyMarker = new String[10];
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                loyaltyMarker[i] = "X";
            } else {
                loyaltyMarker[i] = "-";
            }
        }

        return "Loyalty History: " + loyaltyMarker;
    }

    // inherited methods: toString + equals

    public String toString() {
        return getName() + " (" + determineMembershipStatus()
                + "), " + loyaltyHistory();
    }

    public boolean equals(TheaterMember other) {
        if (this.name == other.name
                && this.loyaltyCredits == other.loyaltyCredits
                && this.countLoyaltyCredits() == other.countLoyaltyCredits()
                && this.determineMembershipStatus() == other.determineMembershipStatus()
                && this.loyaltyHistory() == other.loyaltyHistory()) {
            return true;
        } else {
            return false;
        }
    }
}