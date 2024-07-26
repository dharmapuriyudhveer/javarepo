import java.util.*;
public class test1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name :");
        String name=sc.nextLine();
        System.out.println("Enter the ID");
        int id=sc.nextInt();
        System.out.println("Enter your mobile number");
        long mobileNumber=sc.nextLong();
        System.out.println("Enter your address");
        sc.nextLine();
        String address=sc.next();
        getters g=new getters();
        g.setName(name);
        g.setId(id);
        g.setMobileNumber(mobileNumber);
        g.setAddress(address);
        System.out.println("The student details are:");
        System.out.println(g.getName());
        System.out.println(g.getId());
        System.out.println(g.getMobileNumber());
        System.out.println(g.getAddress());
        
        
    }   
}
