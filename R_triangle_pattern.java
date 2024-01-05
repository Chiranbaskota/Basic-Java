public class R_triangle_pattern
{
public static void main(String[] args)
{
    //for one type
    for(int i=5; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }

    //for another type
    for(int i=1; i<=5; i++){
        for(int j=1; j<=i; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
//System.out.print();
}
}
