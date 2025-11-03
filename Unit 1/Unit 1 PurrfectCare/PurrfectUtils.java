public class PurrfectUtils {

    public static String determineCatMood(Cat cat) {
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
        int newCatId = 0;
        for (int i = 0; i < catId.length(); i++) {
            int spot = catId.charAt(i);
            newCatId += spot - '0';
        }

        char newCatChar = (char) (newCatId % 26 + 'A');
        return newCatChar;
    }

    public static int generateRandomNumber(int low, int high) {
        int highkeeper = high;
        int lowkeeper = low;
        if (low > high) {
            low = highkeeper;
            high = lowkeeper;
        }

        int randomNum = (int) (Math.random() * (high - low + 1) + low);
        return randomNum;
    }

    public static String validateCatId(String catId) {
        int intCatId = Integer.valueOf(catId);

        if (intCatId >= 1000 && intCatId <= 9999) {

            catId = "" + intCatId;
            return catId;

        } else {
            // int a = (int) (Math.random() * 10);
            // int b = (int) (Math.random() * 10);
            // int c = (int) (Math.random() * 10);
            // int d = (int) (Math.random() * 10);
            // int abcd = (a * 1000) + (b * 100) + (c * 10) + d;
            // catId = "" + abcd;

            int abcd = generateRandomNumber(1000, 9999);
            catId = "" + abcd;
            return catId;
        }

    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel < 0) {
            return moodLevel = 0;
        } else if (moodLevel > 10) {
            return moodLevel = 10;
        } else {
            return moodLevel;
        }
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        if (cat.moodLevel < 2 && cat.isHungry == true) {
            cat.moodLevel = cat.moodLevel - 1;
            System.out.println("Petting failed...");
        } else {
            cat.moodLevel = cat.moodLevel + 1;
            System.out.println("Petting successful!");
        }
    }

    public static void trimClaws(Cat cat) {
        int moodDecrease = (int) (Math.random() + 1 * 2);
        if (moodDecrease == 1) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println(cat.getName() + " did not like that...");
        } else {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println(cat.getName() + " really hated that!");
        }

    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out.println("Cleaning the litter box..."
                + "\nDone!\n" + cat.getName() + " appreciated that.");

    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        System.out.println("Filling up " + cat.getName() + "'s bowl..."
                + "\nDone!\n" + cat.getName() + " is eating....\n" + cat.getName()
                + " is full!");
    }
}
