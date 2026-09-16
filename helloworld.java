public class helloworld{
    public static void main(String args[]){
        System.out.println("hello world");
        System.out.println(returnname("Arka")); // assigns the name of the user as Arka for the function returnname
    }



    public static String returnname (String name){
        return ("hey my name is "+ name); 
        // this returns the name of the user 
    }
}