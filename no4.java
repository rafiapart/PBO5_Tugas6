package tugas6pbo;

import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nama: ");
            nama[i] = sc.nextLine();

            System.out.print("Nilai: ");
            nilai[i] = sc.nextInt();
            sc.nextLine();

            if (nilai[i] > 50) status[i] = "Lulus";
            else status[i] = "Tidak Lulus";
        }

        System.out.println("\nDaftar Nilai Mahasiswa");
        System.out.println("No\tNama\t\tNilai\tStatus");

        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "\t" + nama[i] + "\t" + nilai[i] + "\t" + status[i]);
        }
    }
}
