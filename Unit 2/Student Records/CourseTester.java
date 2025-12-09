public class CourseTester {
    public static void main(String[] args) {
        int[] anaScores = { 90, 89, 91, 95 };
        int[] jonScores = { 78, 59, 12, 70 };
        int[] valenceScores = { 80, 85, 90, 95 };
        StudentRecord ana = new StudentRecord("Ana", anaScores);
        StudentRecord jon = new StudentRecord("Jon", jonScores);
        StudentRecord valence = new StudentRecord("Valence", valenceScores);
        ana.toString().equals("Ana's scores: [90, 89, 91, 95]");
        ana.getAverage(0, 3);
        ana.getTestScore(1);
        ana.equals(jon);
        ana.hasImproved();
        valence.hasImproved();
        jon.getFinalAverage();
        valence.getFinalAverage();

    }
}