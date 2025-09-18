public class Student {

    private String name;
    private int grade;
    private String id;
    private String latestOpp;
    private String recentFriend;

    public String generateId() {
        id = "" + (int)(Math.random() * 8 + 1) + (int)(Math.random() * 8 + 1) + (int)(Math.random() * 8 + 1) + "-" + (int)(Math.random() * 10) + (int)(Math.random() * 10) + (int)(Math.random() * 10) + (int)(Math.random() * 10);
        return id;
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getID() {
        return id;
    }

    public void setName(String newName) {
        name = newName;
    }
    public void setGrade(int newGrade) {
        grade = newGrade;
    }

    public void setId(String newId) {
        id = newId;
    }

    public String toString() {
        return name + " is a " + grade + "th grade student. Their ID is " + id + ".";
    }
    
    public boolean equals(Student otherStudent) {
        if (this.name.equals(otherStudent.name)
        && this.grade == otherStudent.grade
        && this.id.equals(otherStudent.id)
        && this.latestOpp.equals(otherStudent.latestOpp)
        ){
            return true;
        }
        return false;
    }
    
    public String vibeCheck(Student other) {
        if(this.latestOpp == other.latestOpp){
            this.recentFriend = other.recentFriend;
            other.recentFriend = this.recentFriend;

            return (this.recentFriend + " and " + other.recentFriend + " are now friends! They both dislike " + latestOpp + ".");
        }
        return (this.recentFriend + " and " + other.recentFriend + " are not friends.");
    }

}