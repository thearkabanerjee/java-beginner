abstract class Employee {
  String name;
  double baseSalary;

  Employee(String name, double baseSalary) {
    this.name = name;
    this.baseSalary = baseSalary;
  }

  abstract double calculateSalary();

  void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("baseSalary: " + calculateSalary());
  }
}
