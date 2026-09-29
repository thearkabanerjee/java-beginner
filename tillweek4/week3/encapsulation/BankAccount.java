class BankAccount{
  private String owner;
  private double balance;

  public BankAccount(String owner, double balance){
    this.owner = owner;
    this.balance = balance;
  }

  public void deposit(double amount){
    if(amount >= 0){
      balance += amount;
      System.out.println("You deposited $"+ amount);
    }
    else{
      System.out.println("Invalid amount");
    }
  }
  public void withdraw(double amount){
    if (amount > balance){
      System.out.println("Not enough money");
    }else{
      balance -= amount;
      System.out.println("withdrawed $"+ amount);
    }
  }
  public double getBalance(){
    return balance;
  }
}
