//constructor overloading
class Student7 {
    int id;
    String name;
    int age;

    Student7(int id, String name, int age) {
       this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }
}
class Thiskey{

    public static void main(String[] args) {
        Student7 s1 = new Student7(111, "kunal", 22);
        Student7 s2 = new Student7(222, "mahesh", 23);
        s1.display();
        s2.display();
    }
}