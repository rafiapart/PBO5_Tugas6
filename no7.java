package tugas6pbo;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread berjalan: " + this.getName());
    }
}

public class no7 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
