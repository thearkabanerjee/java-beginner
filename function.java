import java.util.*;
public class function {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(nameprinter(name));

        sc.close();
    }


    static String nameprinter(String name){
        return ("Hi, "+ name);
    }
}
