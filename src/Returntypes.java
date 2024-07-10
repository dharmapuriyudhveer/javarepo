import java.util.Scanner;
public class Returntypes 
{
    // public static char you()
    // {
    //  return 'Y';
    // }
    public static String me(String e,int b,double c)
    {
        
        System.out.println(b);
        System.out.println(c);
        return e;
        
    }
    public static void main(String[] args) 
    {
        // char m=you();
        // System.out.println(m);

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        sc.nextLine();
        String c=sc.nextLine();
        System.out.println();
        double b=sc.nextDouble();
        

        String n=me(c,a,b);
        System.out.println(n);
    }

}
