public class MsWhalPCTester {
    public static void main(String[] args) {
        System.out.println("haiiiiiiii :3");

        MsWhalPC period1MsWhalPC = new MsWhalPC();
        MsWhalPC funnyPC = new MsWhalPC();

        if (period1MsWhalPC.equals(funnyPC)) {
            System.out.println("They are the same");
        } 
        else {
            System.out.println("They are not the same");
        }

        funnyPC.signIn();
        funnyPC.takeAway(3);
        funnyPC.isBirdOn();



        period1MsWhalPC.signOut();
        period1MsWhalPC.isBirdOn();
        period1MsWhalPC.rename();
        period1MsWhalPC.wreck();
        period1MsWhalPC.replace();
        period1MsWhalPC.takeAway(5);
        period1MsWhalPC.putBack();
        period1MsWhalPC.swivel();
        System.out.println(period1MsWhalPC.toString());

        //how to check if theyre equal
        }
    }
