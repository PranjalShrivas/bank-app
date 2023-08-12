public class Main {
    public static void main(String[] args) {

        HDFCaccount VivekAcc=new HDFCaccount("Vivek","vivek123",2000);

        System.out.println(VivekAcc); // printed the attributes via toString()
        //fetch balance
        System.out.println(VivekAcc.fetchBalance("random")); // wrong password case
        System.out.println(VivekAcc.fetchBalance("vivek123")); // correct password
        // add money
        System.out.println(VivekAcc.addMoney(100000));

        //withdraw
        System.out.println(VivekAcc.withdrawMoney(200000,"vivek123"));
        System.out.println(VivekAcc.withdrawMoney(50000, "vivek123"));
        System.out.println(VivekAcc.withdrawMoney(50000, "v23"));

        //change Password
        System.out.println(VivekAcc.changePassword("vivek123","vivek"));
        System.out.println(VivekAcc.fetchBalance("vivek"));

        // calculate interest
        System.out.println("Interest for 5 year is "+VivekAcc.calculateInterest(5));

    }
}