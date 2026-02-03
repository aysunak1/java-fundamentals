import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        int total = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\servi\\nyp\\nyp18\\src\\sayilar.txt"));
            String line = null;
            while ((line =bufferedReader.readLine())!=null){
                total += Integer.valueOf(line);
            }
            System.out.println("Toplam: " + total);
        } catch (FileNotFoundException e) {

        } catch (Exception e) {
            System.out.println("Hata oluştu.");
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception exception) {
                System.out.println("Loglandı:" + exception);
            }

        }
    }
}
