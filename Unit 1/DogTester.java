public class DogTester {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fido", "Paul", 5, 123);
        Dog dog2 = new Dog();
        Dog dog3 = new Dog("Pal", "Jim", 23, 693);
        Dog dog4 = new Dog("Fido", "Paul", 5, 123);

        dog1.toString();
        dog2.toString();
        dog3.toString();

        dog1.setAge(7);
        dog2.setName("Odin");
        dog3.setStillInFacility(false);
        dog4.setAge(7);

        dog1.toString();
        dog2.toString();
        dog3.toString();

        System.out.println(PawsomeUtils.generateDogChar(dog1.getDogId()));
        System.out.println(PawsomeUtils.generateDogChar(dog2.getDogId()));

        System.out.println(dog1.generateDogTag());
        System.out.println(dog2.generateDogTag());
        System.out.println(dog3.generateDogTag());

        dog1.equals(dog2);
        dog1.equals(dog4);
    }

}
