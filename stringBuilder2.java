public class stringBuilder2
{
public static void main(String[] args)
{
    StringBuilder a=new StringBuilder("My name is Chiranjivi Baskota");
   for(int i=0; i<a.length()/2; i++){

    int front=i;
    int back=a.length()-1-i;

    char frontChar=a.charAt(front);
    char backChar=a.charAt(back);

    a.setCharAt(front,backChar);
    a.setCharAt(back,frontChar);

   }

   System.out.println(a);
//System.out.print();
}
}
