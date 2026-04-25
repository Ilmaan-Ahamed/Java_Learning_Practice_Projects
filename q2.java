public class q2 {
    
    public static void printAllPairs(int[] arr) {
        // Print all possible pairs of numbers using enhanced for loops
        for (int first : arr) {
            for (int second : arr) {
                System.out.print("(" + first + ", " + second + ") ");
            }
            System.out.println(); // New line after each row
        }
    }
    
    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4};
        System.out.println();
        System.out.println("All pairs from the array:");
        System.out.println();
        printAllPairs(numbers);
    }
}


