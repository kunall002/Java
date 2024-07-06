class Value{
    public static void main(String[] args) {
        int a=10;
        System.out.println("before value "+a);
        swap(a);
        System.out.println("after value swapping "+a);

    }
    public static void swap(int value){
        value=20;
        System.out.println("inside value method "+value);
    }
}