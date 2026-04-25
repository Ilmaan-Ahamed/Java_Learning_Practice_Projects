public class q1 {
    
    public static void printArray(int[] arr) {
        // Using enhanced for loop
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array elements:");
        printArray(numbers);
    }
}









