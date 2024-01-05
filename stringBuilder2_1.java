public class stringBuilder2_1
{
public static void main(String[] args)
{
    StringBuilder sc=new StringBuilder("My name is Chiranjivi Baskota");
    
    for(int i=sc.length()-1; i>=0; i--){
        System.out.print(sc.charAt(i));
    }
    System.out.println();
   String a= sc.substring(0,5);
   System.out.println(a);
//System.out.print();
}
}
