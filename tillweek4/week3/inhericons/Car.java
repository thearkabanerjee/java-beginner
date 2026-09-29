class Car extends Vehicle{
  int doors;

  Car(String brand, int year, int doors){
    super(brand, year);
    this.doors = doors;
  }

  void displayInfo(){
    System.out.println("Brand: "+ brand);
    System.out.println("Year: "+ year);
    System.out.println("Doors: "+ doors);
  }

}
