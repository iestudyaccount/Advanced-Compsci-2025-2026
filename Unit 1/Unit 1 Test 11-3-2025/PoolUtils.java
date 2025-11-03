public class PoolUtils {

    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel < 0) {
            return cleanlinessLevel = 0;
        } else if (cleanlinessLevel > 10) {
            return cleanlinessLevel = 10;
        } else {
            return cleanlinessLevel;
        }
    }

    public static String generateUsername(String name) {
        String firstName = "";
        String lastName = "";

        for (int i = 0; i < name.length(); i++) {
            char nameBreaker = charAt(i);
            if (this.nameBreaker = " ") {

            }

        }
        int randomYear = (int) (Math.random() * 100 + 1950);

        return "@" + firstName + "_" +
                lastName + "_" + randomYear;

    }

    public static void cleanPool(Pool pool) {

        pool.cleanlinessLevel = pool.cleanlinessLevel + 2;

    }

    public static String fixName(String name) {
        String trimmedName = name.trim();

        for (int i = 0; i < trimmedName.length(); i++) {
            char nameBreaker = charAt(i);
            if (this.nameBreaker + 1 == ' ') {

            }

        }

    }

}
