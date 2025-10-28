public class DogTester {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fido", "Paul", 5, 123);
        Dog dog2 = new Dog();
        Dog dog3 = new Dog("Pal", "Jim", 23, 693);

        dog1.toString();
        dog2.toString();
        dog3.toString();

        dog1.setAge(7);
        dog2.setName("Odin");
        dog3.setStillInFacility(false);

        dog1.toString();
        dog2.toString();
        dog3.toString();

        System.out.println(PawesomeUtils.generateDogChar(dog1.getDogId()));
        dog1.setDogChar((PawesomeUtils.generateDogChar(dog1.getDogId())));

        System.out.println(PawesomeUtils.generateDogChar(dog2.getDogId()));
        dog2.setDogChar((PawesomeUtils.generateDogChar(dog2.getDogId())));

        System.out.println(PawesomeUtils.generateDogTag(dog1.getDogId(), dog1.getDogChar()));
        System.out.println(PawesomeUtils.generateDogTag(dog2.getDogId(), dog2.getDogChar()));
        System.out.println(PawesomeUtils.generateDogTag(dog3.getDogId(), dog3.getDogChar()));

        System.out.println(PawesomeUtils.validateDogId(dog1.getDogId()));
        System.out.println(PawesomeUtils.validateDogId(dog2.getDogId()));
        System.out.println(PawesomeUtils.validateDogId(dog3.getDogId()));

        dog2.setDogId(-53);

        System.out.println(PawesomeUtils.validateDogTag(dog1));
        System.out.println(PawesomeUtils.validateDogTag(dog2));
        System.out.println(PawesomeUtils.validateDogTag(dog3));

        System.out.println(dog1.equals(dog2));

        Dog dog4 = dog1;

        System.out.println(dog1.equals(dog4));

        dog2.setStillInFacility(false);
        dog2.toString();
    }

}
