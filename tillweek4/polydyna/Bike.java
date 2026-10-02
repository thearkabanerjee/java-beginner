class Bike extends Vehicle {

  Bike(String name) {
    super(name);
  }

  @Override
  void move() {
    System.out.println(name + " is riding");
  }
}
