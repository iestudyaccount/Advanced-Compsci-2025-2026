public class Pool {

    String name;
    String ownerName;
    String username;
    int cleanlinessLevel;
    boolean needsChemicalCheck;

    Pool(String name, String ownerName, int cleanlinessLevel) {
        this.name = name;
        this.ownerName = ownerName;
        this.username = PoolUtils.generateUsername();
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel();
        this.needsChemicalCheck = false;

    }

    Pool() {
        this.name = "Oasis";
        this.ownerName = "John Doe";
        this.username = PoolUtils.generateUsername();
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel();
        this.needsChemicalCheck = false;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getUsername() {
        return username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public boolean isNeedsChemicalCheck() {
        return needsChemicalCheck;
    }

    // Setters

    public void setName(String name) {
        this.name = PoolUtils.fixName(name);
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public void setNeedsChemicalCheck(boolean needsChemicalCheck) {
        this.needsChemicalCheck = needsChemicalCheck;
    }

    // Methods

    public String toString() {
        return "=ABOUT POOL=\n"
                + "Name: " + name
                + "\nOwner Name: " + ownerName
                + "\nUsername: " + username
                + "\n Level: " + cleanlinessLevel
                + "\nDoes pool need chemical check?: " + needsChemicalCheck;
        // if(needsChemicalCheck = true)
        // {
        // "Yes";
        // } else {
        // "No";
        // };

    }

    public boolean equals(Pool other) {
        if (this.name.equals(other.name)
                && this.ownerName.equals(other.ownerName)
                && this.username.equals(other.username)
                && this.cleanlinessLevel == other.cleanlinessLevel
                && this.needsChemicalCheck == other.needsChemicalCheck) {
            return true;
        } else {
            return false;
        }
    }

}
