public class SkyViewTester {
    public static void main(String[] args) {
        double[] scanTest1 = { 0.5, 0.7, 0.9, 0.11, 0.13, 0.15 };
        SkyView skyTest1 = new SkyView(3, 2, scanTest1);

        double[] scanTest2 = { 0.5, 0.7, 0.6, 0.11, 0.19, 0.15 };
        SkyView skyTest2 = new SkyView(3, 2, scanTest2);

        double[] scanTest3 = { 0.5, 0.7, 0.9, 0.11, 0.13, 0.15 };
        SkyView skyTest3 = new SkyView(3, 2, scanTest3);

        System.out.println(skyTest1.toString());
        System.out.println(skyTest1.equals(skyTest2));
    }
}
