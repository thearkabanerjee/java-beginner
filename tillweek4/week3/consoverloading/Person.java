class Person {
  String name;
  int age;


  Person(String name , int age){
    this.name = name;
    this.age = age;
  }
  Person(String name){
    this.name = name;
    age = 0;
  }


  void displayInfo(){
    System.out.println("name: "+ name);
    System.out.println("age: "+ age);
  }
}
