public class BankAccount{
  String owner;
  double balance = 0.0;

  void deposit (double amount){
    balance += amount;
  }

  void withdraw (double amount){
    if (amount > balance){
      System.out.println("You cannot withdraw more than what you have");
    }else{
      balance -= amount;
      System.out.println("You withdrew $" + amount);
    }
  }

  void displayBalance(){
    System.out.println(balance);
  }


}
