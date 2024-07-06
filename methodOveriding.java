//method overriding
class vehicle{
    void run(){
        System.out.println("vehicle is running");
    }
}
class Bike extends vehicle{
    void run() {
        System.out.println("bike is running");
    }

    public static void main(String[] args) {
        Bike b=new Bike();
        b.run();

    }
}