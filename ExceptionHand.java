public  class ExceptionHand {
    public static void main(String[] args) {
        try {
           int data = 100/0;
           String s=null;
            System.out.println(s.length());
        }catch (ArithmeticException | NullPointerException e){

            System.out.println(e + "\n exception occur");
        }
    }
}