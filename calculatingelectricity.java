import java.util.*;

public class calculatingelectricity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String print = "total electricity bill is ";
        if (a <=100 ){
            System.out.println (print + (a * 1.5));
        }else if (a >= 100 && a <=200){
            System.out.println(print + ((100 * 1.5) + ((a - 100)* 2.5)));
        }else {
            System.out.println (print + '$' +((100 * 1.5) + (100 * 2.5) + ((a - 200)* 4)));
        }


        sc.close();
    }
}
