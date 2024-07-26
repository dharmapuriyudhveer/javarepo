package Interface;


class Father implements GrandFather{

    @Override
    public void Bike(String BikeName) 
    {
        System.out.println("Bike name : "+BikeName);
    }
    public static void main(String[] args) 
    {
        Father f = new Father();
        f.Bike("KTM");    }

}
