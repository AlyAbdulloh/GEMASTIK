package LipatKertas;

import java.util.Scanner;

public class LipatKertas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] kertas = new int[n][3];

        for (int i = 0; i < n; i++) {
            kertas[i][0] = sc.nextInt();
            kertas[i][1] = sc.nextInt();
            kertas[i][2] = sc.nextInt();
            System.out.println("\n");
        }

        for (int i = 0; i < n; i++) {
            lipat(kertas[i][0], kertas[i][1], kertas[i][2]);
        }
    }

    static void lipat(int p, int q, int m) {
        for (int i = 0; i < m; i++) {
            if (p > q) {
                p /= 2;
            } else {
                q /= 2;
            }
        }

        if (p > q) {
            System.out.println(p + " " + q);
        } else {
            System.out.println(q + " " + p);
        }
    }

}
