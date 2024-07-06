class Bike1{
    final void run(){
        System.out.println(" running");
    }
}
class Honda2 extends Bike1{
    public static void main(String[] args) {
        Honda2 h=new Honda2();
        h.run();

    }
}