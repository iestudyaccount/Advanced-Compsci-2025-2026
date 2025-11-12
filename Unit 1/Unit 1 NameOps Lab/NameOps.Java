public class NameOps {

    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";
    }

    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        for (int i = 0; i < name.length() - 1; i++) {
            char niceChara = name.charAt(i);
            if (niceChara == ' ') {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSecondSpace(String name) {

        int firstSpaceDigit = indexOfFirstSpace(name);
        if (firstSpaceDigit == -1) {
            return -1;
        }
        String newName = name.substring(firstSpaceDigit + 1);
        if (indexOfFirstSpace(newName) == -1) {
            return -1;
        }
        int secondSpaceDigit = indexOfFirstSpace(name) + indexOfFirstSpace(newName) + 1;
        return secondSpaceDigit;

    }

    public static String findFirstName(String name) {
        for (int i = 0; i < name.length() - 1; i++) {

            char lastCharOfFirstName = name.charAt(i);
            if (lastCharOfFirstName == ' ') {
                return name.substring(0, i);
            }
        }
        return name;
    }

    public static String findLastName(String name) {

        int findFirstSpace = indexOfFirstSpace(name);
        if (findFirstSpace == -1) {
            return "";
        }
        String secondHalfOfName = name.substring((findFirstSpace) + 1);

        int firstSpaceInLastName = indexOfFirstSpace((secondHalfOfName));
        if (firstSpaceInLastName == -1) {
            return secondHalfOfName;
        }
        String newName = secondHalfOfName.substring(firstSpaceInLastName + 1);
        return newName;

    }

    public static String findMiddleName(String name) {

        // John Jacob JingleHeimer

        if (indexOfFirstSpace(name) == -1 || indexOfSecondSpace(name) == -1) {
            return "";
        }

        String middleName = name.substring(indexOfFirstSpace(name) + 1, indexOfSecondSpace(name));

        return middleName;
    }

    public static String generateLastFirstMidInitial(String name) {

        String firstName = NameOps.findFirstName(name);
        String lastName = NameOps.findLastName(name);
        String middleName = NameOps.findMiddleName(name);

        if (middleName.length() == 0 && lastName.length() == 0) {
            return firstName;
        } else if (middleName.length() == 0) {
            return lastName + ", " + firstName;
        } else {
            char middleInitial = middleName.charAt(0);
            return lastName + ", " + firstName + " " + middleInitial + ".";
        }

    }
}
