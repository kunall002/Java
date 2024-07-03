class Studentt{
    int rollno;
    String name;
    void insertRecord(int r,String n){
        rollno=r;
        name=n;
    }
    void displayRecord(){
        System.out.println(rollno+" "+name);
    }
}
public class TestStudent1 {
public static void main(String[] args) {
    Studentt s1 = new Studentt();
    Studentt s2 = new Studentt();
    s1.insertRecord(101,"kunal");
    s2.insertRecord(102,"mahesh");
    s1.displayRecord();
    s2.displayRecord();

}
    
}