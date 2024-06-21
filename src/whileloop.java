import java.util.Scanner;

public class whileloop 
{
    public static void main(String[] args) 
    {
        //int i=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int i=sc.nextInt();
        
        while(i<5)
        {
            System.out.println(i);
            i++;
        }
    }
}
