import java.util.Scanner;

public class Pemilihan2Percobaan105modif {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        System.out.println("Masukkan tahun: ");
        int tahun = input05.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun kabisat");
            } else {
                System.out.println("Bukan tahun kabisat");
            }

        } else
            System.out.println("Bukan tahun kabisat");
    }
}