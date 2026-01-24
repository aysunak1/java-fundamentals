public class DiziOrnekleri {
    public static void main(String[] args) {

        // DİZİLER (ARRAYS)
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Aysun";
        ogrenciler[1] = "Aygul";
        ogrenciler[2] = "Aynur";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("------------------------------------");

        // GENEL KULLANIM (for-each)
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
        System.out.println("------------------------------------");

        // ÖRNEK
        double[] sayilar = {1.4, 1.8, 2.5, 7.8, 5.3, 6.2};
        double toplam = 0;
        double max = sayilar[0];

        for (double number : sayilar) {
            if (max < number) {
                max = number;
            }
            toplam = toplam + number;
            System.out.println(number);
        }

        System.out.println("Toplamı: " + toplam);
        System.out.println("En büyük: " + max);
    }
}
