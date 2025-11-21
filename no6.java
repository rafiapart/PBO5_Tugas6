package tugas6pbo;

import java.util.*;

public class no6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();

        while (true) {
            System.out.print("Masukkan angka (ketik stop untuk selesai): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("stop")) break;

            try {
                int v = Integer.parseInt(input);
                data.add(v);
            } catch (Exception e) {
                System.out.println("Bukan angka! Coba lagi.");
            }
        }

        int total = 0;
        for (int x : data) total += x;

        double rata = (double) total / data.size();
        System.out.println("Rata-rata = " + rata);
    }
}
