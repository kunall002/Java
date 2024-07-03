class Student6{
    int rollno;
    String name;
    static String collegename="SSBT";
    Student6(int r,String n){
        rollno=r;
        name=n;
            }
            void display(){
                System.out.println(rollno+" "+name+" "+collegename);
            }
}
            public class Statickey {
                public static void main(String[] args) {
                    Student6 s1 = new Student6(111,"kunal");
                    Student6 s2 = new Student6(222,"mahesh");
                    s1.display();
                    s2.display();


            }
}