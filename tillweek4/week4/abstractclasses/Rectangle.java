
class Rectangle extends Shape {
  double length;
  double width;

  Rectangle(String name, double length, double width) {
    super(name);
    this.length = length;
    this.width = width;
  }

  double area() {
    return (length * width);
  }

}
