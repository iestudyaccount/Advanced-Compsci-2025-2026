import java.util.ArrayList;

public class StudentAnswerSheet {
    private String name;
    private double testScore;
    private ArrayList<String> answers = new ArrayList<String>();

    // constructor

    StudentAnswerSheet(String name, ArrayList<String> answers) {
        if (answers == null || name == null) {
            throw new IllegalArgumentException("ArrayList can't be null.");
        } else {
            this.name = name;
            this.answers = answers;
            this.testScore = 0.0;
        }
    }

    // getters

    public String getName() {
        return this.name;
    }

    public double getTestScore() {
        return this.testScore;
    }

    public ArrayList<String> getAnswers() {
        return this.answers;
    }

    // get grade method here

    public double getGrade(ArrayList<String> key) {
        if (key.size() != answers.size()) {
            throw new IllegalArgumentException("Each parameter must be same length to proceed.");
        } else {
            int correctAnswers = 0;
            int incorrectAnswers = 0;
            int omittedAnswers = 0;
            for (int i = 0; i < answers.size(); i++) {
                if (answers.get(i) == key.get(i)) {
                    correctAnswers++;
                } else if (answers.get(i) == "?") {
                    omittedAnswers++;
                } else {
                    incorrectAnswers++;
                }
            }

            double finalGrade = ((correctAnswers * 1) - (incorrectAnswers * 0.25));
            testScore = finalGrade;
            return finalGrade;
        }
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

}