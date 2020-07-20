public class hello {
    public static void main(String[] args) {
        account account=new account();//"433545",0,"GangaNayan TL","gagshs@gamil.com",988014921);
//        account.setNumber("444133435"); we do not want to use this because we calling constructor
//        account.setBalance(0.0);
//        account.setCustomername("GangaNayan T L");
//        account.setEmail("ganganayan18@gmail.com");
//        account.setPhoneno(988014921);

        System.out.println(account.getNumber());
        System.out.println(account.getBalance());

        account.Deposit(500);
        account.withdraw(100);
        account.Deposit(100);
        account.withdraw(100);

        account gangaaccount=new account("venu","ganga@nayan",9880);
        System.out.println(gangaaccount.getNumber());
        System.out.println(gangaaccount.getBalance());


    }
}
