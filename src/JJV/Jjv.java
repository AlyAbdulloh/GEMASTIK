package JJV;

import java.util.Scanner;
public class Jjv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[15000];
        int[] y = new int[15000];

        int n = sc.nextInt();
        int[] jm = new int[n];

        for(int i = 0 ; i < jm.length ; i++){
            jm[i] = sc.nextInt();
        }

        for(int i = 0; i < jm.length ; i++){
            int b = 1;
            int jum = jm[i];
            int xx = 0;
            int yy = 0;
            for(int a = jum ; a > 0 ; a-= b){
                if(b%4 == 1){
                    xx += b;
                }else if(b%4 == 2){
                    yy += b;
                }else if(b%4 == 3){
                    xx -= b;
                }else if(b%4 == 0){
                    yy -= b;
                }
                b++;
            }
            x[i] = xx;
            y[i] = yy;
        }
        
        for(int i = 0; i < jm.length ; i++){
            System.out.println(x[i]+" "+y[i]);
        }
    }
}
