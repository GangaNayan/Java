public class account {
    private String number;
    private double balance;
    private String customername;
    private String email;
    private int phoneno;

    public account(){
        this("default number",0,"default name","default mail",000000);
        System.out.println("empty constructor called"); // we cannot use this statement first because first line of code should be *this*
        // *this* is used that call another constructor checks for parameters
    }

    public account(String number,double balance,String customername,String email,int phoneno ){
        System.out.println("constructor is called");
        setNumber(number);//or this.number=number;    we can this if there is a proper validation >  public void setNumber(String number) {
     this.balance=balance; // use this method
     this.customername=customername;
     this.email=email;
     this.phoneno=phoneno;
    }

    public account(String customername, String email, int phoneno) {
        this("99999",987,customername,email,phoneno);
//        this.customername = customername; we dont want to use this because its already initiated in another constructor
//        this.email = email;
//        this.phoneno = phoneno;

    }

    public void Deposit(double depositamount){
        this.balance +=depositamount;
        System.out.println("amount of Rs "+depositamount+" is deposited to your account "+number);
    }
    public void withdraw(double withdrawamount){
        if(this.balance-withdrawamount<0){
            System.out.println("withdrawal can't  process your balance is Rs "+this.balance);
        }else {
            this.balance -=withdrawamount;
            System.out.println("Amount of Rs "+withdrawamount+" is Debited from your account "+this.number+" and your remaining balance is Rs "+this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }
}
// and also we can create another java class with different many objects and many constructors