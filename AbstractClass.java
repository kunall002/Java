abstract class AbstractClass {
    abstract void run();
}

class Honda4 extends AbstractClass {
    void run() {
        System.out.println("running safely");
    }

    public static void main(String[] args) {
        Honda4 h = new Honda4();
        h.run();
    }
}
