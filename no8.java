package tugas6pbo;

import java.util.Scanner;

public class no8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Berapa banyak thread? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Thread t = new Thread(() -> {
                System.out.println("Thread berjalan: " + Thread.currentThread().getName());
            });
            t.start();
        }
    }
}
