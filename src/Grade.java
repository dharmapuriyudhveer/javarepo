import java.util.Scanner;

public class Grade 
{
    public static void main(String[] args) 
    {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter the ");
        int i=in.nextInt();

        if(i>=90)
        System.out.println("A+ Grade");

        else if(i>=80 && i<=89)
        System.out.println("A Grade");

        else if(i>=70 && i<=79)
        System.out.println("B Grade");

        else if(i>=60 && i<=69)
        System.out.println("C Grade");

        else if(i>=50 && i<=59)
        System.out.println("D Grade");

        else
        System.out.println("fail");
    }    
}
