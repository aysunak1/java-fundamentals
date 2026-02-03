import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList degerler = new ArrayList();
        degerler.add(1);
        degerler.add(5);
        degerler.add(8);
        degerler.add("Ankara");
        for(Object i : degerler){
            System.out.println(i);
        }
        ArrayList<Integer> sayilar1 = new ArrayList<Integer>();
        sayilar1.add(5);
        sayilar1.add(9);
        sayilar1.add(12);
        sayilar1.add(75);
        int toplam = 0;
        int dongu = 0;
        System.out.println("Sayılar");
        System.out.println("-----------------");
        for (int sayi :sayilar1){
            dongu++;
            System.out.println(dongu+ ".sayı:" +sayi);
            toplam += sayi;

        }
        System.out.println("Toplam = " + toplam);

    }
}
