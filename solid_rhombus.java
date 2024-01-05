public class solid_rhombus
{
public static void main(String[] args)
{
    for(int i=5; i>=1; i--){
        //for blank space
        for(int j=1; j<=(i-1); j++){
            System.out.print(" ");
        }
        //for star printing
        for(int j=1; j<=5; j++){
            System.out.print("*");
        }
        System.out.println();
    }
//System.out.print();
}
}
