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
        gradeTests();
    }

    // getters

    public ArrayList<String> getAnsKey() {
        return this.answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return this.submissions;
    }

    // setters

    public void setAnsKey(ArrayList<String> newKey) {
        this.answerKey = newKey;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> subs) {
        this.submissions = subs;
    }

    // methods

    public void submit(StudentAnswerSheet student) {
        submissions.add(student);
    }

    public void gradeTests() {
        for (int row = 0; row < submissions.size(); row++) {
            StudentAnswerSheet stu = submissions.get(row);
            stu.setTestScore(stu.getGrade(answerKey));
        }
    }

    public String highestScoringStudent() {
        if (submissions.size() == 0) {
            return "";
        } else {
            String highestScorer = "";
            for (int i = 0; i < submissions.size() - 1; i++) {
                if (submissions.get(i + 1).getScore() > submissions.get(i).getScore()) {
                    highestScorer = submissions.get(i + 1).getName();
                }
            }
            return highestScorer;
        }
    }

}
