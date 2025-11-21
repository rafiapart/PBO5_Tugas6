package tugas6pbo;

public class no9 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        // ini for biasa
        for (int i = 0; i < age.length; i++)
            System.out.print(age[i] + " ");

        System.out.println();

        // ini foreach
        for (int x : age)
            System.out.print(x + " ");
    }
}
