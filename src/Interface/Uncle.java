package Interface;

class Uncle implements GrandFather
{

    @Override
    public void Bike(String BikeName) 
    {
        System.out.println("Bike name : "+BikeName);
    }
    public static void main(String[] args)
    {
        Uncle u = new Uncle();
        u.Bike("Honda");
    }
}