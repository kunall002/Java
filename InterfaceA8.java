interface printable{
    void print1();
}
class InterfaceA8 implements printable{
       public void print1(){
           System.out.println("interface implemented");}
    public static void main(String[] args) {
        InterfaceA8 obj =new InterfaceA8();
        obj.print1();
    }
}