public class HubTester {
    public static void main(String[] args) {
        Student testStudent1 = new Student("Jim-bob", "xxxxyyyy", "jim@bob.com");
        Student testStudent2 = new Student("Kayla", "yyyyzzzz", "kayla12@gmail.com");

        // student
        nameWithAtSymbol(testStudent1);

        // hub

        // assignment

    }

    // student exceptions
    public static void nameWithAtSymbol(Student testStudent1) {
        try {
            testStudent1.changeName("Jim-b@b");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Testing @ symbol in new Name");
        }

    }

    public static void nameIsTaken(Student testStudent1) {
        try {
            testStudent1.changeName("Kayla");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Testing changing a name to one already in array");
        }
    }

    public static void studentNameMissing4Pass(Student testStudent) {
        try {
            testStudent.resetPassword();
        }

    }

    public static void studentNameNull4Pass(Student testStudent) {

    }

    // hub exceptions

}
