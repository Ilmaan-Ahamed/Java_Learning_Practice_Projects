// Get input for size an array
// Get input for each element in an array
// Find and print element in an array

import java.util.Scanner;
class CC3p2q4{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        // STEP 1: Get input for the size of an array
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        // STEP 2: Create an array
        int[] array = new int[size];

        // STEP 3: Get input for each element in the array using for loop
        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter number " + (i + 1) + " : ");
            array[i] = scan.nextInt();
        }

        // STEP 4: Printing the whole array for reference using for loop
        System.out.print("\n");
        for(int i = 0; i < size; i++)
        {
            System.out.println("Array of " + i + " : " + array[i]);
        }
        System.out.print("\n");

        // STEP 5: To find the middle element in the array
        int k = array.length;
        int mid = k / 2;

        // STEP 6: Print the middle element for both odd and even cases
        if(k % 2 != 0)
        {
            System.out.println("Middle element: " + array[mid]);
        }
        else
        {
            System.out.print("Middle elements: " + array[mid - 1]);
            System.out.print(" And " + array[mid]);
        }
    }
}