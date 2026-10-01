public class Main{
  public static void main(String[] args){
    Animal a1 = new Dog("Bruno");
    Animal a2 = new Cat("Milo");


    Animal[] animals = {a1, a2};

    for (int i = 0; i < animals.length; i++){
      animals[i].makeSound();
    }
  }
}
