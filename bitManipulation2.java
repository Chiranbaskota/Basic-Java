//wap to reset the bit at given position
public class bitManipulation2
{
public static void main(String[] args)
{
    int a=10;//binary of 10 is 1010
    int bitMask;
    int pos=2;
    bitMask=1<<pos;
    int result;
    result=bitMask|a;
    System.out.println("The number after resetting the bit is "+result);

//System.out.print();
}
}
