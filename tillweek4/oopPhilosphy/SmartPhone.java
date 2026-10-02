class SmartPhone {
  String brand;
  int battery;
  boolean poweredOn;

  SmartPhone(String brand, int battery, boolean poweredOn) {
    this.brand = brand;
    this.battery = battery;
    this.poweredOn = poweredOn;
  }

  void powerOn() {
    poweredOn = true;
  }

  void powerOff() {
    poweredOn = false;
  }

  void usePhone(int minutes) {
    if (poweredOn == false) {
      System.out.println("Phone is off");
    } else {
      if (minutes <= battery) {
        battery -= minutes;
      } else {
        poweredOn = false;
      }
    }

  }

  void charge(int amount) {
    if ((battery + amount) <= 100) {
      battery += amount;
    } else {
      battery = 100;
    }
  }

  void displayStatus() {
    System.out.println("Brand: " + brand);
    System.out.println("Battery: " + battery + "%");
    System.out.println("PoweredOn: " + poweredOn);
  }
}
