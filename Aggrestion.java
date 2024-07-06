
public class Aggrestion
{
    int id;
    String name;
    Address address;

    public Aggrestion(int id, String name, Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        //we called out side contructor  Address to create object
        Address address1=new Address("gzd","maharastra","india") ;
        Address address2=new Address("gno","up","india");

        Aggrestion A=new Aggrestion(111,"kunal",address1);
        Aggrestion A2=new Aggrestion(112,"mahesh",address2);

        A.display();
        A2.display();
    }
}