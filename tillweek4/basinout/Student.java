public class Student {

  String name;
  int age;
  double marks;
  char grade;
  boolean passed;

  void displayInfo() {
    System.out.printf("name: %s%nAge: %d%nMarks: %f%ngrade: %c%npassed: %b%n", name, age, marks, grade, passed);
  }
}
