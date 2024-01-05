//wap to clear the bit at given position
public class bitManipulation3
{
public static void main(String[] args)
{
    int a=10;   //binary of 10 is 1010
    int pos=1;
    int bitMask;
    bitMask=1<<pos;
    int result;
    result=a&(~bitMask);
    System.out.println(result);
    //System.out.print();
    if(!(a==result)){
        System.out.println("okay");
    }
}
}
