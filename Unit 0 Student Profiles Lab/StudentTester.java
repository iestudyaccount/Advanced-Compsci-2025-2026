public class StudentTester {
    public static void main(String[] args) {
        Student chris = new Student("Chris", 11);
        chris.toString();
        chris.setGrade(12);
        chris.toString();
        chris.vibeCheck(chris);

        Student connie = new Student("Connie");
        connie.toString();
        connie.setGrade(11);
        connie.toString();
        connie.vibeCheck(chris);

        Student lucasYu = new Student("Lucas", 11);
        lucasYu.toString();
        lucasYu.setGrade(10);
        lucasYu.toString();
        lucasYu.vibeCheck(connie);

        Student dozer = new Student("Dozer");
        dozer.toString();
        dozer.setGrade(12);
        dozer.toString();
        dozer.vibeCheck(lucasYu);
    }
}
