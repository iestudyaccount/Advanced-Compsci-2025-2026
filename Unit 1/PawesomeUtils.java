public class PawesomeUtils {

    public static String generateDogTag(int dogId, char dogChar) {
        String dogTag = "" + dogId + dogChar;
        return dogTag;
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            int dogIdOne = (int) (Math.random() * 900 + 100);
            dogId = dogIdOne;
            return dogId;
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int dogId = dog.getDogId();
        char dogChar = dog.getDogChar();

        String newDogTag = "" + dogId + dogChar;
        String dogTag = dog.getDogTag();

        if (dogTag == newDogTag) {
            return true;
        } else {
            return false;
        }

    }

    public static char generateDogChar(int dogId) {
        int firstDig = (int) (dogId * 0.01);
        int middleDig = (int) ((dogId / 10) % 10);
        int lastDig = (int) (dogId % 10);
        int dogChar = 'F' + ((firstDig + middleDig + lastDig) % 10);
        return (char) dogChar;
    }

    public static String pickup(Dog dog, String personName) {
        dog.getStillInFacility();
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(false);
            System.out.println(dog + " has been returned to their owner " + personName + ".");
            return dog + " has been returned to their owner " + personName + ".";
        } else {
            return "That's not their owner! " + dog + " can't leave!";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.getStillInFacility();
        dog.getOwnerName();

        PawesomeUtils.validateDogTag(dog);
        if (validateDogTag(dog) == true) {
            dog.setStillInFacility(true);
            dog.setOwnerName(personName);
        } else {
            System.out.println("This dog is counterfeit! It cannot enter the facility.");
        }

    }

    // when age < 1; human years = 0
    // when age = 1, human years = 15
    // when age = 2, human years = 24 (15 + 9)
    // when age >2, human years = 15 + 9 + 5(humanyears)

    public static int convertAgeToHuman(Dog dog) {
        int age = dog.getAge();
        int humanAge;
        if (age >= 3) {
            humanAge = 24 + (5 * age);
            return humanAge;
        } else if (age <= 2 && age > 1) {
            humanAge = 24;
            return humanAge;
        } else if (age == 1) {
            humanAge = 15;
            return humanAge;
        } else {
            humanAge = 0;
            return humanAge;
        }

    }

    // when human age is 15 or less, dog age = 1
    // when human age is between 15 and 24 (inclusive), dog age = 2
    // when human age is above that, add one dog year for every five human years

    public static int convertAgeToDogYears(int humanYears) {
        int dogYears;
        if (humanYears > 24) {
            dogYears = 2 + (1 * humanYears);
            return dogYears;
        } else if (humanYears > 15 && humanYears <= 24) {
            dogYears = 2;
            return dogYears;
        } else if (humanYears == 15) {
            dogYears = 1;
            return dogYears;
        } else {
            dogYears = 0;
            return dogYears;
        }

    }
}
