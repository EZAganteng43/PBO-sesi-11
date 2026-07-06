import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {

    public static void main(String[] args) {

        String csvFile = "student.csv";
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true))) {

            System.out.print("Masukkan jumlah data yang ingin ditambahkan: ");
            int jumlah = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < jumlah; i++) {

                System.out.println("\n=== Data Mahasiswa " + (i + 1) + " ===");

                System.out.print("NIM   : ");
                String nim = scanner.nextLine();

                System.out.print("Nama  : ");
                String nama = scanner.nextLine();

                System.out.print("Umur  : ");
                String umur = scanner.nextLine();

                System.out.print("Prodi : ");
                String prodi = scanner.nextLine();

                // Menulis data ke CSV
                bw.write(nim + "," + nama + "," + umur + "," + prodi);

                // Pindah ke baris berikutnya
                bw.newLine();

                // Memastikan data langsung tersimpan
                bw.flush();
            }

            System.out.println("\nData berhasil ditambahkan ke file " + csvFile);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        scanner.close();
    }
}