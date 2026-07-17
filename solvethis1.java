// question
// Write a program to find the sum of the following series up to n terms.
// 12 + ( 12 + 22 ) + ( 12 + 22 + 32 ) + ......... + ( 12 + 22 + .... + n2 )


import java.util.*;
public class solvethis1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int innersum = 0;
    

        for (int i = 1; i <=n ; i++){
            innersum += i * i;
            sum += innersum;
        }

    System.out.println(sum);
    sc.close();


    }
    
}
