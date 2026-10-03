class Circle extends Shape {
  double radius;

  Circle(String name, double radius) {
    super(name);
    this.radius = radius;
  }

  double area() {
    return (3.14 * radius * radius);
  }

}
