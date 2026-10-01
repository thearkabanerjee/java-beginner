class Main{
  public static void main(String[] args){
    Shape circle = new Circle(5);
    Shape rectangle = new Rectangle(10, 4);

    System.out.println(circle.calculateArea());
    System.out.println(rectangle.calculateArea());
  }
}
