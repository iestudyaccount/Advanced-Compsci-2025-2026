public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // getters
    // to-do: implement getters

    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // to-do: implement getTestScore

    public int getTestScore(int testNumber) {
        int testScore;
        if(scores.indexOf(testNumber) == null) {
            testScore = 0;
            return testScore;
        }
    

        return 
    }

    // inherited methods
    // to-do: implement toString

    public String toString() {
        String partOne = name + "'s scores: [";
        String partTwo = "";
        for (int i = 0; i < scores.length; i++) {
            partTwo += scores[i] + ",";
            if (i == scores.length - 1) {
                partTwo += scores[i];
            }
        }
        String partThree = "]";
        return partOne + partTwo + partThree;
    }

    // equals

    public boolean equals(StudentRecord other) {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] != other.scores[i]) {
                return false;
            }
        }

        if (this.name == other.name
                && this.scores.length == other.scores.length) {
            return true;
        }
        return false;
    }

    // methods

    /*
     * returns the average (arithmetic mean) of the values in scores
     * precondition: 0 <= first < last < scores.length
     * 
     * @param first - the first index of the scores array
     * 
     * @param last - the last index of the scores array
     * 
     * @return the double average of the values in scores
     */
    public double getAverage(int first, int last) {
        int totalScores = 0;
        int average;
        for (int i = first; i <= last; i++) {
            totalScores += scores[i];
        }

        average = totalScores / scores.length;

        return average;
    }

    /*
     * Determines if each successive value in scores is greater
     * than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {
        int tempValue;
        for (int i = 0; i < scores.length; i++) {
            tempValue = scores[i];
            if (scores[i] < tempValue) {
                return false;
            }
        }
        return true;
    }

    /*
     * The method determines if the student has improved and returns the average
     * score appropriately:
     * If the student has improved, returns the average
     * of the top half of the scores array.
     * Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */

    public double getFinalAverage() {
        if (hasImproved() == true) {
            getAverage(0, 0)

        } else {
            getAverage(scores[0], scores[scores.length-1]);
        }
    }

}