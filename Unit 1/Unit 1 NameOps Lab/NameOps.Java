public class NameOps {

    public static String printMethodCall(String method, String name) {
        return this.method + "(\"" + this.name + "\"): ";
    }

    public static String whoIsAwesome(String name) {
        return this.name + "is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        for(int i = 0; i < name.length() - 1; i++)
        {
            char niceChara = charAt(i);
            if(this.niceChara == ' ') {
                return i;
            } else {
                return -1;
            }
        }
    }

    public static int indexOfSecondSpace(String name) {
 
        char nextNiceChar = name.indexOfFirstSpace();
            if(this.nextNiceChar = '') {
                for(int k = this.nextNiceChar; k < name.length() - 1; k++)
                char nextSpace = charAt(k)k
                if(this.nextSpace == ' ') {
                    return k;
                } else {
                    return -1;
                }
            }
        }


    public static String findFirstName(String name) {
        for(int i = 0; i < name.length() - 1; i++) {

            char lastCharOfFirstName = name.charAt(i);
        if(this.lastCharOfFirstName == ' ') {
            return name.substring(0, this.lastCharOfFirstName - 1)
        } else {
            return this.name;
        }
        }

    }

    public static String findLastName(String name) {

        // John Jacob JingleHeimer

        String firstname = NameOps.findFirstName(name);
        String secondHalf = name.substring(name.indexOfFirstSpace() + 1, name.length()-1);
        
        //Jacob JingleHeimer

        String newName = secondHalf.substring(secondHalf.indexOfFirstSpace() + 1, name.length()-1);

        return newName;

    }

    public static String findMiddleName(String name) {
        String firstName = NameOps.findFirstName(name);
        String lastName = NameOps.findLastName(name);
    }
}