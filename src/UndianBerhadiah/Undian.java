package UndianBerhadiah;

/**
 * Undian
 */
import java.util.Scanner;

public class Undian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nomor = sc.nextInt();
        int[] noUndian = new int[n];
        System.out.println("\n");


        int lebih = 10000;
        int kurang = -100000;
        int x =0;
        int y = 0;
        for(int i = 0; i < noUndian.length; i++){
            noUndian[i] = sc.nextInt();
            int cek = nomor - noUndian[i];
            if(cek >= 0){
                if(lebih > cek){
                    lebih = cek;
                    y = noUndian[i];
                }
            }else{
                if(kurang < cek){
                    kurang = cek;
                    x = noUndian[i];

                }
            }

        }

        System.out.println("\n"+y+" "+x);

        
    }
}