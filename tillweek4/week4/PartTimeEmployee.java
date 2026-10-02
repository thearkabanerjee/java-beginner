class PartTimeEmployee extends Employee {
  int hoursWorked;
  double hourlyRate;

  PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
    super(name, 0);
    this.hoursWorked = hoursWorked;
    this.hourlyRate = hourlyRate;
  }

  @Override
  double calculateSalary() {
    return (hoursWorked * hourlyRate);
  }
}
