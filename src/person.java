public class person 
{
    String name;
    int id;
    long mobileNumber;
    String address;
    public person(String name, int id, long mobileNumber,String address)
    {
        this.name=name;
        this.id=id;
        this.mobileNumber=mobileNumber;
        this.address=address;
    }
    @Override
    public String toString() {
        return "person [name=" + name + ", id=" + id + ", mobileNumber=" + mobileNumber + ", address=" + address + "]";
    }
    
    }


