package tugas6pbo;

public class no2 {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                mobil[i] = "Lambhorgini";
                System.out.println("Nilai baru pada index " + i + ": " + mobil[i]);
            }
        }
    }
}
 

