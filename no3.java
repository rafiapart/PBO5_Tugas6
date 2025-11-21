package tugas6pbo;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0], min = arr[0];
        int idxMax = 0, idxMin = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idxMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                idxMin = i;
            }
        }
        System.out.println("Nilai terbesar: " + max + " (index: " + idxMax + ")");
        System.out.println("Nilai terkecil: " + min + " (index: " + idxMin + ")");

        int total = 0;
        for (int x : arr) total += x;

        double rata = (double) total / n;
        System.out.println("Jumlah semua elemen = " + total);
        System.out.println("Rata-rata = " + rata);
        
        int jmlGanjil = 0;
        for (int i = 1; i < n; i += 2) jmlGanjil += arr[i];
        System.out.println("Jumlah elemen berindeks ganjil = " + jmlGanjil);

        int jmlGenap = 0;
        for (int i = 0; i < n; i += 2) jmlGenap += arr[i];
        System.out.println("Jumlah elemen berindeks genap = " + jmlGenap);
        if (total % 2 == 0) System.out.println("Jumlah total bernilai GENAP");
        else System.out.println("Jumlah total bernilai GANJIL");
        java.util.Arrays.sort(arr);
        System.out.print("Array setelah diurutkan: ");
        for (int x : arr) System.out.print(x + " ");
    }
}
