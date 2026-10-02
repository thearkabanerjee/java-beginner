
public class Main {
  public static void main(String[] args) {
    Vehicle v1 = new Car("Toyota");
    Vehicle v2 = new Bike("Yamaha");
    Vehicle v3 = new Car("BMW");

    Vehicle[] vehicles = { v1, v2, v3 };

    for (Vehicle vehicle : vehicles) {
      vehicle.move();
    }
  }
}
