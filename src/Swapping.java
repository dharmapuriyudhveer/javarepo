public class Swapping 
{
    public static void main(String[] args) 
    {
        int a=3;
        int b=5;
        // int temp;

        // System.out.println("Before swapping two numbers wiil be : "+a+" "+b);
        // temp=a;
        // a=b;
        // b=temp;
        // System.out.println("After swapping the numbers will be : " +a+" "+b);

        a=a+b; //3+5=8
        b=a-b; // 8-5=3
        a=a-b; //8-3=5
        System.out.println("after swapping the numbers will be : " +a+" "+b);
    }
}
