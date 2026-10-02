public class Main {
  public static void main(String[] args) {
    SmartPhone smartphone = new SmartPhone("Samsung", 22, true);

    smartphone.powerOn();
    smartphone.usePhone(11);
    smartphone.charge(77);
    smartphone.usePhone(21);
    smartphone.displayStatus();
    smartphone.powerOff();
  }
}
