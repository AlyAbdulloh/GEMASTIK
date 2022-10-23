package BitCoin;

import java.util.Scanner;
public class BitCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] bit = new int[n];
        int keuntungan = 0;

        for(int i = 0; i < bit.length; i++){
            bit[i] = sc.nextInt();
        }

        for(int i = 0 ; i < bit.length-1; i++){
            if(bit[i] < bit[i+1]){
                keuntungan = keuntungan + (bit[i+1] - bit[i]);
            }
        }

        System.out.println("Keuntungan = "+keuntungan);
    }
}
