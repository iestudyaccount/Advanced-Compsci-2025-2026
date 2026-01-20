public class HubTester {
    public static void main(String[] args) {
        Student testStudent1 = new Student("Jim-bob", "xxxxyyyy", "jim@bob.com");
        Student testStudent2 = new Student("Kayla", "yyyyzzzz", "kayla12@gmail.com");
        Student testStudent3 = new Student("", "qqqqrrrr", "nothing@none.com");
        Student testStudent4 = new Student(null, "rrrrssss", "null@nothing.com");

        Student[] testArray1 = { testStudent1, testStudent2, testStudent3, testStudent4 };
        int studentCount1 = testArray1.length;

        // student
        nameWithAtSymbol(testStudent1);
        nameIsTaken(testStudent1);
        studentNameMissing4Pass(testStudent3);

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

    public static void noAssignments2TurnIn(Assignment[] testAssignments) {
        try {
            testAssignments.submitAssignment();
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Trying to turn in assignments when there are none");
        }

    public static void assignCountTooHigh(Student testStudent) {
        // fill in later
    }

    public static void firstStringBlank(Student testStudent) {
        // fill in later
        try {
            testStudent.requireNotBlank();
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Neither of the 2 strings can be blank, but the 1st one is.");
        }
    }

    public static void SecondStringBlank(Student testStudent) {
        try {
            testStudent.requireNotBlank();
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Neither of the 2 strings can be blank, but the 2nd one is.");
        }
    }

    public static void noEmail(Student testStudent) {
        // fill in later
        try {
            testStudent.requireEmail("cool.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("No @ symbol in the email, so not valid");
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

    public static void studentOutOfIndex(Hub testHub) {
        try {
            testHub.loginStudent("Shoopy", "aaaabbbb");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This student does not exist, and thus is out of bounds.");
        }
    }

}
