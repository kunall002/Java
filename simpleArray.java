class Array {
    void min(int arr[]) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Minimum value: " + min);
    }

    int[] get() {
        return new int[]{10, 20, 30, 40, 50};
    }
    void printArray(int arr[]){
        for(int i:arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Array arrayInstance = new Array(); // Create an instance of the Array class

        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        // Using for-each loop to iterate through the array
        for (int i : a) {
            System.out.println(i);
        }

        // Print a new line for separation
        System.out.println();

        // Another array example
        int array[] = {20, 30, 40, 50, 60};
        for (int i : array) {
            System.out.println(i);
        }

        // Finding the minimum value in another array
        int b[] = {33, 3, 4, 5, 1};

        System.out.println();
        arrayInstance.min(b); // Call the min method on the instance

        System.out.println();
        int arr[] = arrayInstance.get(); // Call the get method on the instance
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
        arrayInstance.printArray(new int[]{10,20,30,40,50});
        System.out.println();

        int arrrr[]={50,60,70,80};

        for(int i=0;i<arrrr.length;i++){
            System.out.println(arrrr[i]);
        }
    }
}
