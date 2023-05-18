class Account{
    private int balance=5000;

    public int getbalance(){
        return balance;
    }
    
    public void setbalance(int amount){
        balance=balance+amount;
        System.out.println("Account credited with Rs."+amount);
    }
}
public class i {   
    public static void main(String[] args) {
        Account a =new Account();

        System.out.println("Your account has a amount of Rs."+a.getbalance());

        a.setbalance(1000);
        System.out.println("Your account has a amount of Rs."+a.getbalance());
    }
    
}
