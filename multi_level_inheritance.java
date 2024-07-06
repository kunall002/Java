class Animal1{
    void eat(){
        System.out.println("eating");
    }
}
class Cat extends Animal1{
    void Jumping(){
        System.out.println("Jumping");
    }
}
class Cow extends Cat{
  void sleep(){
      System.out.println("sleeping");
  }
}
class Tem{
    public static void main(String[] args) {
        Cow c = new Cow();
        c.eat();
        c.sleep();
        c.Jumping();
    }
}