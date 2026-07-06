import java.io.*;

public class CSVCopy {
    public static void main(String[] args) {
        String sourceFile = "D:\\PBO\\TUGAS 11\\student.csv";
        String destinationFile = "D:\\PBO\\TUGAS 11\\copy_student.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File berhasil disalin ke " + destinationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}