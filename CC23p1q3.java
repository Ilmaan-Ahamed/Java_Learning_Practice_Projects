// Count the number of odd number from 1 to 10

class CC23p1q3 {

    public static void main(String[] args) {
        
        int oddcount = 0;
        
        for(int i=1; i<=10; i=i+1)
        {
            if(i%2==0)
            {
                //System.out.println("Even number:"+i);
            }
            else{
                oddcount = oddcount + 1;
                //System.out.println("Odd Number"+ i);
            }
        }
        System.out.println(oddcount);
    }
}