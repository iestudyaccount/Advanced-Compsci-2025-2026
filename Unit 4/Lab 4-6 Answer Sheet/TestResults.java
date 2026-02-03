import java.util.ArrayList;

public class TestResults {
    private ArrayList<String> answerKey = new ArrayList<String>();
    private ArrayList<StudentAnswerSheet> submissions = new ArrayList<StudentAnswerSheet>();

    TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        if (key == null || submissions == null) {
            throw new IllegalArgumentException("Neither parameter can be null");
        }
        this.answerKey = key;
        this.submissions = submissions;
    }

    // getters

    public ArrayList<String> getAnsKey() {
        return this.answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubs() {
        return this.submissions;
    }

    // setters

    public void setAnsKey(ArrayList<String> newKey) {
        this.answerKey = newKey;
    }

    public void setSubs(ArrayList<StudentAnswerSheet> subs) {
        this.submissions = subs;
    }

    // methods

    public void submit(StudentAnswerSheet student) {
        submissions.add(student);
    }

    public void gradeTests() {
        for (int row = 0; row < submissions.size(); row++) {

        }
    }

    public String highestScoringStudent() {
        String highestScorer = "";
        for (int r = 0; r < submissions.size(); r++) {
            if (submissions.getScore(r + 1) > submissions.getScore(r)) {
                highestScorer = submissions.getName(r);
            }
        }
        return highestScorer;
    }

}
