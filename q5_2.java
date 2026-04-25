public class q5_2 {
    
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // Recursive case
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " (recursive): " + factorial(number));
    }
}









