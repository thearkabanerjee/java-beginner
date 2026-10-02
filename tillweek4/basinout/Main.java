package tillweek4.basinout;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student student = new Student();

    student.name = sc.nextLine();
    student.age = sc.nextInt();
    student.marks = sc.nextFloat();
    student.grade = sc.next().charAt(0);
    student.passed = sc.nextBoolean();

    student.displayInfo();
  }
}
