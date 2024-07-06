class Animal2{
    void eat(){
        System.out.println("eating");
    }
}
class Cat1 extends Animal2{
    void Jumping(){
        System.out.println("Jumping");
    }
}
class Cow1 extends Animal2{
    void sleep(){
        System.out.println("sleeping");
    }
}
class hirarchical{
    public static void main(String[] args) {
        Cow1 c = new Cow1();
        // we need to create object cat1 for calling his function
       // Cat1 cc = new Cat1();
       // cc.Jumping();
        c.eat();
        c.sleep();
    }
}