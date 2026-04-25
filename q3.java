import java.util.Scanner;

public class q3 {
    
    public static int linearSearch(int[] arr, int target) {
        // Enhanced for loop implementation
        int index = 0;
        for (int num : arr) {
            if (num == target) {
                return index; // Return index if found
            }
            index++;
        }
        return -1; // Return -1 if not found
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = {4, 2, 7, 1, 9, 5, 8};

        System.out.println("Enter Number you want");
        int get_num = scan.nextInt();

        int target = get_num;

        // int target = 7;
        
        int result = linearSearch(numbers, target);
        
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }

        scan.close();
    }
}



