class Main{
  public static void main(String[] args){
    BankAccount bankaccount = new BankAccount("Arka", 21000);

    bankaccount.deposit(200);
    bankaccount.deposit(-200);
    bankaccount.withdraw(400);
    bankaccount.withdraw(4000);

    System.out.println("Balance: "+ bankaccount.getBalance());
  
  }
}
