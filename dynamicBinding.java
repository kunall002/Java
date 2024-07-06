class Animal9{
    void eat(){
        System.out.println("Animal is running");
    }
}
class Dog5 extends Animal9{
    void eat(){
        System.out.println("Dog is running");
    }

    public static void main(String[] args) {
        Dog5 d1 = new Dog5();
        d1.eat();
    }
}