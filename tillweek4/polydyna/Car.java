class Car extends Vehicle {

  Car(String name) {
    super(name);
  }

  @Override
  void move() {
    System.out.println(name + " is driving");
  }
}
