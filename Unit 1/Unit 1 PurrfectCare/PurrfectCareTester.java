public class PurrfectCareTester {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Tim", "Jim", 7, "4578");
        cat1.setCatId("6767");

        PurrfectUtils.pet(cat1);

        for (int i = 0; i < 5; i++) {
            PurrfectUtils.trimClaws(cat1);
        }

        PurrfectUtils.cleanLitterBox(cat1);

        PurrfectUtils.feed(cat1);

    }
}
