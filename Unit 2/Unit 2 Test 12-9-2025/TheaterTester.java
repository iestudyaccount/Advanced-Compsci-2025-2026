public class TheaterTester {
    public static void main(String[] args) {
        TheaterMember ana = new TheaterMember("Ana");
        TheaterMember jon = new TheaterMember("Jon");
        TheaterMember valence = new TheaterMember("Valence");

        ana.grantLoyaltyCredit();
        for (int i = 0; i <= 5; i++) {
            jon.grantLoyaltyCredit();
        }
        for (int i = 0; i <= 6; i++) {
            valence.grantLoyaltyCredit();
        }

        System.out.println(ana.determineMembershipStatus());
        System.out.println(jon.determineMembershipStatus());
        System.out.println(valence.determineMembershipStatus());

        TheaterMember[] galaxyCustomers = { ana, jon, valence };
        Theater galaxyFilms = new Theater("Galaxy Films", galaxyCustomers);

        TheaterMember sisouk = new TheaterMember("Sisouk");

        galaxyFilms.registerMember(sisouk);

    }
}
