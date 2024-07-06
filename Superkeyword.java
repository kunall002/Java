class Animal3{
    String color="white";
}
class Dog2 extends Animal3{
    String color="black";
    String getDog2color() {
        return super.color;
    }

}
class Dog3 extends Dog2{
    String color="yellow";
    void printcolor(){
        System.out.println(color);
        System.out.println(super.color);
        System.out.println(getDog2color());
    }
}
class TestSuper1{
    public static void main(String[] args) {
        Dog3 d=new Dog3();
        d.printcolor();

    }
}