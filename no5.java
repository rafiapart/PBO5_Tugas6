package tugas6pbo;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah baris: ");
        int r = sc.nextInt();
        System.out.print("Jumlah kolom: ");
        int c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] C = new int[r][c];

        System.out.println("Input matriks A:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Input matriks B:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                B[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                C[i][j] = A[i][j] + B[i][j];

        System.out.println("\nHasil Penjumlahan:");
        for (int[] x : C) {
            for (int y : x) System.out.print(y + " ");
            System.out.println();
        }
    }
}

