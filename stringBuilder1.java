import java.util.*;
public class stringBuilder1
{
public static void main(String[] args)
{
   //Strings are immutable so we use string builder funtions to modify the contents of the strings
   String a;
   Scanner sc=new Scanner(System.in);
   a=sc.nextLine(); 
   StringBuilder c=new StringBuilder(a);
   System.out.println(c);
   
   //char at index
   System.out.println(c.charAt(5));

   //setchar at index
   c.setCharAt(3,'f');
   System.out.println(c);

   //insert char at index
   c.insert(3,'i');
   System.out.println(c);

   //delete char from one index to another index
   c.delete(4,6);
   System.out.println(c);

   //append new character
   //append can also be done in string but it takes more time and memory
   c.append('c');   // same as c=c+'c'
   System.out.println(c);

//System.out.print();
}
}
