import java.util.Scanner;

public class forloop 
{
  public static void main(String[] args) 
  {
        //for(int i=5;i>=0;i--)
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value");
        int i=sc.nextInt();
        
        for(;i<=10;)
        {
            System.out.println("The count: "+ i);
            i++;
        }
  }  
}
