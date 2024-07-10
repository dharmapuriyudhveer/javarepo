public class typesoff 
{
    //int a=10;
    static int a=20;

    public void You()
    {
        int a=12;
        System.out.println(a);
    }

    public static void you()
    {
        int b=21;
        System.out.println(b);
    }
    public static void main(String[] args) 
    {
        typesoff b=new typesoff();
        b.a=2;
        b.a=5;
        //System.out.println(b.a); //It will show the updated value.
        //System.out.println(b); //It will show the address.
        System.out.println(a);
        b.You();

        typesoff c=new typesoff();
        //System.out.println(c.a); //It will show the variable value.
        //System.out.println(c);
        System.out.println(a);
        you();
    }
}
