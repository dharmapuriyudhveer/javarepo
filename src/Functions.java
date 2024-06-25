public class Functions 
{
    static String a="Yudhveer";

    int e=21;

    public void Yud()
    {
        int a=10;
        System.out.println(a);
    }

    public static void You()
    {
        String y="Me";
        System.out.println(y);
    }
    public static void main(String[] args) 
    {
        Functions b=new Functions();
        a="YudhVeer";
        System.out.println(a + " ");
          You();

        Functions c=new Functions();
        System.out.println(a);

        Functions d=new Functions();
        d.e=31;
        System.out.println(d.e);

        Functions e=new Functions();
        System.out.println(e.a +" " + d.a);
        e.Yud();
    }   
    
}
