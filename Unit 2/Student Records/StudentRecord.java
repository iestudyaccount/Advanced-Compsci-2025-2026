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
        if (testNumber >= 0 || testNumber < scores.length) {
            int testScore = scores[testNumber];
            return testScore;

        } else {
            return -1;
        }

        // if(currentScore == -1) {
        // testScore = 0;
        // return testScore;
        // } else {
        // testScore = currentScore;
        // return testScore;

        // }
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

        if (this.name.equals(other.name)
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
        double totalScores = 0;
        double average;
        for (int i = first; i <= last; i++) {
            totalScores += scores[i];
        }

        average = totalScores / (last - first + 1);

        return average;
    }

    /*
     * Determines if each successive value in scores is greater
     * than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
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
        double average;
        if (hasImproved() == true) {
            int first = scores.length / 2;
            int last = scores.length - 1;
            average = getAverage(first, last);
            return average;

        } else {
            average = getAverage(0, scores.length - 1);
            return average;
        }
    }

}