public class Arrays_addition {
    public static void main(String[] args) {
        // Store Array Grp 01
        int[] num1 = new int[5];
        int[] num2 = new int[5];
        int[] num3 = new int[5];
        
        int num =5;
        for (int i=0; i<5; i++){
           num1[i]=i;

        }


        for (int i=0; i<5; i++){
            num2[i] =num;
            ++num;
        }
        System.out.println("Vaues of arry 'num 1 + num 2': ");
        for (int i=0; i<5; i++){
            System.err.print(num1[i]+ " ");
        }


        System.out.println("Vaues of arry 'num 1': ");
        for (int i=0; i<5; i++){
            System.err.print(num2[i]+ " ");
        }

        for(int i=0; i<5; i++){
            num3[i] = num1[i] + num2[i];
        }
        System.out.println("Vaues of arry 'num 2': ");
        for (int i=0; i<5; i++){
            System.err.print(num3[i]+ " ");
        }


    }
}
