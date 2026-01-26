public class HubTester {
    public static void main(String[] args) {
        Student testStudent1 = new Student("Jim-bob", "xxxxyyyy", "jim@bob.com");
        Student testStudent2 = new Student("Kayla", "yyyyzzzz", "kayla12@gmail.com");
        Student testStudent3 = new Student("", "qqqqrrrr", "nothing@none.com");
        Student testStudent4 = new Student(null, "rrrrssss", "null@nothing.com");

        Student[] testArray1 = { testStudent1, testStudent2, testStudent3, testStudent4 };

        Assignment testAssign2 = new Assignment(null, "theres nothing here!");
        Assignment testAssign3 = new Assignment("test program 2", null);
        Assignment testAssign7 = new Assignment("test program 6", "haha");

        Hub testHub1 = new Hub();

        // student
        nameWithAtSymbol(testStudent1);
        nameIsTaken(testStudent1);
        studentNameMissing4Pass(testStudent3);
        studentNameNull4Pass(testStudent4);
        noNameOnAssignment(testStudent1, testAssign2);
        noDescOnAssignment(testStudent1, testAssign3);
        noMoreAssignments(testStudent2, testAssign7);

        // hub

        noUsername4Login(testHub1, testArray1);
        wrongPassword(testHub1, testArray1);
        studentDoesntExist(testHub1, testArray1);
        studentAlreadyExists(testHub1, testArray1);
        atSymbolInName(testHub1);
        noName(testHub1);
        noPassword(testHub1);
        noEmail(testHub1);
        studentOutOfIndex(testHub1, testArray1);

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
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Trying to reset a password reset w/o a name");
        }

    }

    public static void studentNameNull4Pass(Student testStudent) {
        try {
            testStudent.resetPassword();
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Trying to change a password when name = null");
        }
    }

    public static void noNameOnAssignment(Student testStudent, Assignment testAssignment) {
        try {
            testStudent.submitAssignment(testAssignment.getTitle(), testAssignment.getDescription());
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Can't submit an assignment if it has no name.");
        }
    }

    public static void noDescOnAssignment(Student testStudent, Assignment testAssignment) {
        try {
            testStudent.submitAssignment(testAssignment.getTitle(), testAssignment.getDescription());
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Can't submit an assignment if it doesn't have a description.");
        }
    }

    public static void noMoreAssignments(Student testStudent, Assignment testAssignment) {
        try {
            testStudent.submitAssignment(testAssignment.getTitle(), testAssignment.getDescription());
            testStudent.submitAssignment(testAssignment.getTitle(), testAssignment.getDescription());
            testStudent.submitAssignment(testAssignment.getTitle(), testAssignment.getDescription());
            testStudent.submitAssignment(testAssignment.getTitle(), testAssignment.getDescription());
            testStudent.submitAssignment(testAssignment.getTitle(), testAssignment.getDescription());
            testStudent.submitAssignment(testAssignment.getTitle(), testAssignment.getDescription());
        } catch (Exception e) {
            System.out.println(e.toString());

            System.out.println("Can't submit an assignment if the space to hold assignments is already full.");
        }
    }

    // hub exceptions

    public static void noUsername4Login(Hub testHub, Student[] testArray1) {
        try {
            testHub.loginStudent(testArray1[3].name, testArray1[3].password);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("No name in the student trying to log in");
        }

    }

    public static void wrongPassword(Hub testHub, Student[] testArray1) {
        try {
            testHub.loginStudent(testArray1[1].name, testArray1[0].password);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Incorrect password, should not be used for this student");
        }
    }

    public static void studentDoesntExist(Hub testHub, Student[] testArray1) {
        try {
            testHub.doesStudentExist("Timothy");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Timothy does not exist in the Hub system.");
        }
    }

    public static void studentAlreadyExists(Hub testHub, Student[] testArray1) {
        try {
            testHub.registerStudent(testArray1[0].name, testArray1[0].password, testArray1[0].email);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This student already exists, cannot create a new one with the same info");
        }

    }

    public static void atSymbolInName(Hub testHub) {
        try {
            testHub.registerStudent("J@ne", "abcdefgh", "jane@janemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("You cannot have a name with an at symbol in it.");
        }
    }

    public static void noName(Hub testHub) {
        try {
            testHub.registerStudent(null, "hgfedcba", "nothing@example.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Cannot register a student without a name");
        }
    }

    public static void noPassword(Hub testHub) {
        try {
            testHub.registerStudent("Stupid", null, "Ihaveno@opsec.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("You really tried to registered an account w/o a password? Where's your opsec, dumbass?");
        }
    }

    public static void noEmail(Hub testHub) {
        try {
            testHub.registerStudent("Tim", "12348678a", null);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Must include an email when registering a student.");
        }
    }

    public static void studentOutOfIndex(Hub testHub, Student[] testArray) {
        try {
            testHub.loginStudent("Shoopy", "aaaabbbb");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This student does not exist, and thus is out of bounds.");
        }
    }

}
