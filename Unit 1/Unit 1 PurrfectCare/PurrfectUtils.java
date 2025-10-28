public class PurrfectUtils {

    public static String determineCatMood(PurrfectCare cat) {
        if (cat.moodLevel >= 7 && cat.moodLevel <= 10) {
            return "Currently, " + cat.name + " is in a great mood."
                    + "\n Petting is appreciated.";
        } else if (cat.moodLevel < 3 && cat.moodLevel <= 7) {
            return "Currently, " + cat.name + "is reminiscing of a past life."
                    + "\n Petting is acceptable.";
        } else {
            return "Currently, " + cat.name + " is plotting revengance."
                    + "\n Petting is extremely risky.";
        }
    }

    public static char generateCatChar(String catId) {

    }

    public static int generateRandomNumber(int low, int high) {

    }

    public static String validateCatId(String catId) {

    }

    public static int validateMoodLevel(int moodLevel) {
        moodLevel = PurrfectCare.getMoodLevel();
        if (moodLevel < 0) {
            return moodLevel = 0;
        } else if (moodLevel > 10) {
            return moodLevel = 10;
        } else {
            return 
        }
    }

    public static void bootUp(PurrfectCare cat) {
        System.out.println()
    }

    public static void pet(PurrfectCare cat) {
        System.out.println("Attempting to pet...");
        if (cat.moodLevel < 2 && cat.isHungry == true) {
            cat.moodLevel = cat.moodLevel = 1;
            System.out.println("Petting failed...");
        } else {
            cat.moodLevel = cat.moodLevel + 1;
            System.out.println("Petting successful!");
        }
    }

    public static void trimClaws(PurrfectCare cat) {

    }
}
