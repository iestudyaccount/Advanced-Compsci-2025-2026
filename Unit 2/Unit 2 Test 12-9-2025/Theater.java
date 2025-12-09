public class Theater {
    // instance variable
    private String theaterName;
    private TheaterMember[] registeredMembers;

    // constructors

    Theater(String theaterName, TheaterMember[] registeredMembers) {
        this.theaterName = theaterName;
        this.registeredMembers = registeredMembers;
    }

    Theater(String theaterName, int initialCapacity) {
        this.theaterName = theaterName;
        this.registeredMembers = new TheaterMember[initialCapacity];
    }

    // methods

    public boolean isFull() {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        int newCapacity = registeredMembers.length * 2;
        TheaterMember[] newSystem = new TheaterMember[newCapacity];
        for (int i = 0; i < registeredMembers.length; i++) {
            newSystem[i] = registeredMembers[i];
        }
        registeredMembers = newSystem;
    }

    public void registerMember(TheaterMember member) {
        if (isFull()) {
            increaseCapacity();
        }

        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                registeredMembers[i] = member;
                return;
            }
        }

    }

    public boolean deleteMember(TheaterMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == member) {
                registeredMembers[i] = null;
                return true;
            }
        }
        return false;
    }

    // inherited method: toString

    public String toString() {
        String result = "== " + theaterName + " Members ==\n";
        for (int i = 0; i < registeredMembers.length; i++) {
            TheaterMember s = registeredMembers[i];
            result = result + (i + 1) + ".) " + s.getName() + " ("
                    + s.determineMembershipStatus() + "), " + s.loyaltyHistory();

        }
        return result;
    }

}
