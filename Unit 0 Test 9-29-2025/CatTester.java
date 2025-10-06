public class CatTester {

    public static void main(String[] args) {

        Cat myCat = new Cat("Betsy", "Tabby");
        Cat otherCat = new Cat("Tiger Beast", "Tabby");
        System.out.println(myCat.toString());

        // 6. Fixed to make the cat's name print properly
        System.out.println("My Cat's Name: " + myCat.getName());

        // 7. Fixed to make the comparison between cats print properly
        System.out.println("Are the cat's equal?" + myCat.equals(otherCat));

        // 8. added the rest of the needed parts of "System.out.println"
        System.out.println("Is my cat hungry? " + myCat.getIsHungry());

        // 9. Fixed amt of equal signs needed on LastName
        String firstName = "Tiger";
        String lastName = "Beast";
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cats are the same now: " + myCat.equals(otherCat));
    }
}