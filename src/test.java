import java.util.Scanner;

public class test 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name :");
        String name=sc.nextLine();
        System.out.println("Enter the ID :");
        int id=sc.nextInt();
        System.out.println("Enter your mobile number :");
        long mobileNumber=sc.nextLong();
        System.out.println("Enter your address :");
        sc.nextLine();
        String address=sc.nextLine();
        person p=new person(name,id,mobileNumber,address);
       
        System.out.println("The person details are :");
        System.out.println(p.name+" "+p.id+" "+p.mobileNumber+" "+p.address);
        }
}
