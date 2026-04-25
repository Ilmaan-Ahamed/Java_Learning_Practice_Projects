public class Arrays {
    public static void main(String[] args) {
        // Store the array
        char[] a = new char[5];
        a[0]='a';
        a[1]='b';
        a[2]='c';
        a[3]='d';
        a[4]='e';

        //Print out array  need for_loop
        for(int i=0; i<5; i++){
            System.out.println(a[i]);
        }
        System.out.println();
        System.out.println();

        // ex = 2
        int[] b = new int[10];
        for(int i=0; i<10; i++){
            b[i] = i;
        }
        for(int i=0; i<10; i++){
            System.out.println(b[i]);
        }

        
     

       

    }
}
