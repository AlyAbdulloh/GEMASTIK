package BarisPangkat;

/**
 * BarisPangkat
 */
import java.util.Scanner;
import java.math.BigInteger;
public class BarisPangkat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] angka = new BigInteger[n];

        for(int i = 0 ; i < angka.length ; i++){
            int val = sc.nextInt();
            angka[i] = BigInteger.valueOf(val);
        }

        BigInteger x = angka[n-1];

        for(int i = n -2 ; i >= 0 ; i--){
            BigInteger y = angka[i].pow(x.intValue());
            x = y;
        }

        BigInteger mod = BigInteger.valueOf(100000037);
        x = x.mod(mod);
        System.out.println(x);
    }
}