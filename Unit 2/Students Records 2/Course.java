public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;

    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[maxEnrollment];
    }

    // getters
    // to-do: implement getters

    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }
    // setters
    // to-do: implement setters

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // inherited methods

    // to-do: implement toString

    public String toString() {
        String result = "== " + courseName + " ==";
        for (int i = 0; i < enrolledStudents.length; i++) {
            StudentRecord s = enrolledStudents[i];
            result = result + (i + 1) + ".) " + s.getName() + "'s scores: "
                    + s.getScores();
        }

        return result;
    }

    // methods

    public String findBestStudent(StudentRecord[] students) {
        StudentRecord bestStudent = students[0];
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getFinalAverage() > bestStudent.getFinalAverage()) {
                    bestStudent = students[i];
                }
            }
        }
        return bestStudent.getName();
    }

    public double calculateTestAverage(int testNumber) {
        double total = 0;
        double validCount = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            int spefScore = enrolledStudents[i].getTestScore(testNumber);
            if (spefScore >= 0) {
                total += spefScore;
                validCount++;
            }

        }
        if (validCount == 0) {
            return 0.0;
        } else {
            return total / validCount;
        }

    }

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = student;
                return;
            }
        }
    }

    public boolean dropStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == student) {
                enrolledStudents[i] = null;
                return true;
            }
        }
        return false;
    }

    public int countEnrolledStudents() {
        int studentCount = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                studentCount++;
            }
        }
        return studentCount;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        StudentRecord[] updatedEnrolledStudents = new StudentRecord[enrolledStudents.length
                + sizeIncrease];
        for (int i = 0; i < enrolledStudents.length; i++) {
            updatedEnrolledStudents[i] = enrolledStudents[i];
        }

        enrolledStudents = updatedEnrolledStudents;
    }

    /*
     * Iterates through the enrolledStudents array and returns the name of the
     * student with the best final average.
     * 
     * @return the name of the student with the best final average
     */
    // to-do: implement findBestStudent

    /*
     * Iterates through the enrolledStudents array and returns the average of the
     * specified test number.
     * 
     * @return a double representing the average of the specified test number
     */
    // to-do: implement calculateTestAverage
}
