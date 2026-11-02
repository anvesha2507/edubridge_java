package P3;
class BankAcc{
    String account_holder_name;
    int balance;
    void input(){
        account_holder_name="XYZ";
        balance=1000;
    }
    void deposit(){
        System.out.println("Initial Balance: "+balance);
        balance=balance+1000;
        System.out.println("After depositing 1000: "+balance);
    }
    void withdraw(){
        System.out.println("Initial Balance: "+balance);
        balance=balance-100;
        System.out.println("After withdrawing 100: "+balance);
    }
    void checkBal(){
        System.out.println("Current Balance: "+balance);
    }
    public static void main(String[] args){
        BankAcc obj=new BankAcc();
        obj.input();
        obj.deposit();
        obj.withdraw();
        obj.checkBal();
        obj.withdraw();
    }
}