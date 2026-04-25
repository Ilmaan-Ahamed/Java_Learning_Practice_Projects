import java.util.Random;;
class Whileloop {
    public static void main(String[] args) {

        // Print 1 to 10 in while Loop
        int j =1;
        while (j<=10) {
            //System.out.println(j);
            j=j+1;
        }

        // Generate a random number until the number generated random number is 5
        Random rand = new Random();
        int  newnum     = 0;

        while (newnum != 5) {
            newnum = rand.nextInt(11); // last number
            System.out.println(newnum);

        }
        
    }    
}
