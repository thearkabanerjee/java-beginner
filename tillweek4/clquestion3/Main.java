public class Main{
  public static void main(String[] args){
    BankAccount bankaccount = new BankAccount();
    bankaccount.deposit(500);
    bankaccount.withdraw(200);
    bankaccount.withdraw(1200);

    bankaccount.displayBalance();
    
  }
} 
