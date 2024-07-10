import java.util.Scanner;

public class Arrays 
{
    public static void main(String[] args) 
    {
        //int []a={1,2,5,6,7};
        //  System.out.println(a[a.length-3]); 

        // for(int i=1;i<a.length;i++)
        // {
        //     System.out.println(a[i]);
        // }

        // for(int i:a)
        // {
        //     System.out.println(i);
        // }
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("Enter the number :");
        n=sc.nextInt();
        int b[]=new int[n];
        int j;
        int i;
        for( i=0;i<n;i++){
            System.out.println("Enter the "+i+ " index :");
            b[i]=sc.nextInt();
        }
        System.out.println("The numbers you entered are:");
        for (i = 0; i < n; i++) {
        System.out.print(b[i] + " ");
    }

        
        
        // for(int j=0;j<n;j++)
        //  {
        //      System.out.println(j);
        //  }
        
        // for(int i=0;i<a.length;i++)
        // {
        //     if(i==3){
        //         System.out.println(a[i]);
        //         break;
        //     }
            
        // }
    }
}
