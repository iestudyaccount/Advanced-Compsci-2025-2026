public class PawsomeUtils {

    public static generateDogTag(int dogId, char dogChar) {
        String dogTag = "" + dogId + dogChar;
        return dogTag;
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            dogId = (Math.random() * 900 + 100)
                    + (Math.random() * 900 + 100)
                    + (Math.random() * 900 + 100);
            return dogId;
        }
    }

    public static boolean validateDogTag(Dog dog) {
        dog.getDogId();
        dog.dogId.validateDogId();
        dog.dogId.generateDogChar();

        String newDogTag = "" + dog.dogId + dog.dogChar;
        dog.getDogTag();

        if (dog.dogTag == newDogTag) {
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
            dog.stillInFacility = false;
            System.out.println(dog + " has been returned to their owner " + personName + ".");
            return dog + " has been returned to their owner " + personName + ".";
        } else {
            return "That's not their owner! " + dog + "can't leave!";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.getStillInFacility();
        dog.getOwnerName();
        dog.stillInFacility = true;
        dog.ownerName = personName;
    }
}
