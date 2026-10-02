import java.util.*;

public class controlflow {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();

    if (a > 0) {
      System.out.println("Positive");
    } else if (a < 0) {
      System.out.println("Negative");
    } else {
      System.out.println("Zero");
    }

    if (a % 2 == 0 && a != 0) {
      System.out.println("Even");
    } else if (a % 2 != 0) {
      System.out.println("Odd");
    }
    scanner.close();
  }
}
