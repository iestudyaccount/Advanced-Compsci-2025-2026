public class CourseTester {
    public static void main(String[] args) {
        int[] anaScores = { 90, 89, 91, 95 };
        int[] jonScores = { 78, 59, 12, 70 };
        int[] valenceScores = { 80, 85, 90, 95 };
        StudentRecord ana = new StudentRecord("Ana", anaScores);
        StudentRecord jon = new StudentRecord("Jon", jonScores);
        StudentRecord valence = new StudentRecord("Valence", valenceScores);
        System.out.println(ana.toString().equals("Ana's scores: [90, 89, 91, 95]"));
        System.out.println(ana.getAverage(0, 3));
        System.out.println(ana.getTestScore(1));
        System.out.println(ana.equals(jon));
        System.out.println(ana.hasImproved());
        System.out.println(valence.hasImproved());
        System.out.println(jon.getFinalAverage());
        System.out.println(valence.getFinalAverage());

        StudentRecord[] theStudents = { ana, jon, valence };
        Course newClassroom = new Course("Physics", theStudents);

        System.out.println(newClassroom.getCourseName());
        System.out.println(newClassroom.getEnrolledStudents());
        newClassroom.setCourseName("Precalc Honors");
        System.out.println(newClassroom.getCourseName());
        System.out.println(newClassroom.toString());
        System.out.println(newClassroom.findBestStudent(theStudents));
        System.out.println(newClassroom.calculateTestAverage(3));

    }
}