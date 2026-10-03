
abstract class Shape {
  String name;

  Shape(String name) {
    this.name = name;
  }

  abstract double area();

  void displayName() {
    System.out.println("Shape: " + name);
  }
}
