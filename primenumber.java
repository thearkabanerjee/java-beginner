import java.util.*;

public class primenumber{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for (int i = 1; i <= a; i++){
            int counter = 0;

            for (int j = 1 ; j <= i; j++){
                if (i % j == 0){
                    counter += 1;
                }
            }
            if (counter == 2){
                System.out.println(i);
            }
        }
        

        sc.close();
    }
}