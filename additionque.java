public class additionque {
    public static void main(String[] args) {
        int num = 5;
        int[] n1 = new int[5];
        n1[0]='1';
        n1[1]='6';
        n1[2]='3';
        n1[3]='5';
        n1[4]='9';

        for(int i=0; i<5; i++){
            //System.out.println(n1[i]);
        }
        int[] a1 = new int[5];
        a1[0]='2';
        a1[1]='4';
        a1[2]='2';
        a1[3]='6';
        a1[4]='3';

        for (int i=0; i<5; i++) {
            //System.out.println(a1[i]);
        }

        int[] b1 = new int[5];
        for(int i=0; i<5; i++){
            b1[i]=num;
           b1[i] = n1[i] + a1[i]; 
        }
        System.out.println("valu of a1 + n1");
        for(int i=0; i<5; i++){
            System.out.print(b1[i]);
        }

        }
        }


