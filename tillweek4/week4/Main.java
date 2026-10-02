class Main {
  public static void main(String[] args) {
    Employee e1 = new FullTimeEmployee("Arka", 50000, 5000);
    Employee e2 = new PartTimeEmployee("Dhoni", 80, 500);

    e1.displayInfo();
    e2.displayInfo();
  }
}
