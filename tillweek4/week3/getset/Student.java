class Student {
  private String name;
  private int age;
  private double marks;


  void setName(String namey){
    if ((namey != null) && !namey.isEmpty()){
      name = namey;
    }else{
      System.out.println("Entered an invalid name");
    }
  }

  public String getName(){
    return name;
  }

  void setAge(int agey){
    if (agey >= 1 && agey <= 100){
      age = agey;
    }
  }

  public int getAge(){
    return age;
  }

  void setMarks(int mark){
    if (mark >= 0 && mark <= 100){
      marks = mark;
    }
  }


  public double getMarks(){
    return marks;
  }
}
