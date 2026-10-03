
class Main {
  public static void main(String[] args) {
    Shape s1 = new Circle("circle", 10);
    Shape s2 = new Rectangle("rectangle", 10, 20);

    s1.displayName();
    System.out.println(s1.area());

    s2.displayName();
    System.out.println(s2.area());
  }
}
