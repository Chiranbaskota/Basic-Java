import java.util.*;
public class functions
{
    public static void printMyName(String nam){
   //Scanner sc = new Scanner(System.in);

   System.out.println(nam);
    }

    public static void main(String args[]){
        String name;
        System.out.println("Enter your Full name");
        Scanner sc = new Scanner(System.in);
        name =sc.nextLine();
        printMyName(name);
    }
}
