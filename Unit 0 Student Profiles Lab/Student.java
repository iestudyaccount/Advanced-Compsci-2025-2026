public class Student {

    private String name;
    private int grade;
    private String id;
    private String latestOpp;
    private String recentFriend;

    // generates id for every new student
    public String generateId() {
        id = "" + (int) (Math.random() * 8 + 1)
                + (int) (Math.random() * 8 + 1)
                + (int) (Math.random() * 8 + 1)
                + "-"
                + (int) (Math.random() * 10)
                + (int) (Math.random() * 10)
                + (int) (Math.random() * 10)
                + (int) (Math.random() * 10);
        return id;
    }

    // constructor that contains student name and grade
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
        this.latestOpp = "Jim";
        this.recentFriend = "Tim";
    }

    // constructor that only contains student name, defaults to 10th grade
    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
        this.latestOpp = "Jim";
        this.recentFriend = "Tim";
    }

    public Student(String name, int grade, String latestOpp, String recentFriend) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
        this.latestOpp = latestOpp;
        this.recentFriend = recentFriend;
    }

    public Student(String name, String latestOpp, String recentFriend) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
        this.latestOpp = latestOpp;
        this.recentFriend = recentFriend;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    // setters
    public void setName(String newName) {
        name = newName;
    }

    public void setGrade(int newGrade) {
        grade = newGrade;
    }

    public void setId(String newId) {
        id = newId;
    }

    // methods
    public String toString() {
        return name + " is a " + grade + "th grade student. Their ID is " + id + ".";
    }

    public boolean equals(Student otherStudent) {
        if (this.name.equals(otherStudent.name)
                && this.grade == otherStudent.grade
                && this.id.equals(otherStudent.id)
                && this.latestOpp.equals(otherStudent.latestOpp)) {
            return true;
        }
        return false;
    }

    public String vibeCheck(Student other) {
        if (this.latestOpp == other.latestOpp) {
            this.recentFriend = other.recentFriend;
            other.recentFriend = this.recentFriend;
            return (this.recentFriend + " and " + other.recentFriend
                    + " are now friends! They both dislike "
                    + latestOpp + ".");
        }
        return (this.recentFriend + " and " + other.recentFriend + " are not friends.");
    }

}