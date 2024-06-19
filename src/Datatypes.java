import java.util.Scanner;

public class Datatypes 
{
    public static void main(String[] args) 
    {
        // String a ="Student ID";
        // short b=21334;
        // char c ='M';
        // int d=35;
        // long e=21;
        // System.out.println(a);
        // System.out.println("ID no:" + b);
        // System.out.println("Gender :" + c);
        // System.out.println("Roll no :" + d);
        // System.out.println("Age :" + e); 
        Scanner in =new Scanner(System.in);

        System.out.println("Enter the Gender :");
        char t=in.nextLine().charAt(0);

        System.out.println("Enter the name :");
        String s=in.nextLine();

        System.out.println("Enter the id :");
        int i =in.nextInt();

        System.out.println("Char :"+t);
        System.out.println("Name :" + s);
        System.out.println("ID : " + i);
        
        
    }
}
