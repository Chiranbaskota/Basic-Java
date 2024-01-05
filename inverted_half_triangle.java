public class inverted_half_triangle
{
public static void main(String[] args)
{
    int n=4;
    int k;
    for(int i=1; i<=n; i++)
    {
        for(k=1;k<=n-i;k++)
        {
           System.out.print(" "); 
        }

        for(int j=1; j<=i; j++)
        {
           System.out.print("*");
        }
        
        System.out.println();
    }
//System.out.print();
}
}