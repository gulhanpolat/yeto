import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz");
        int not = in.nextInt();
        System.out.println("fizik notunuzu giriniz");
        int not1 = in.nextInt();
        System.out.println("Kimya notunuzu giriniz");
        int not2 = in.nextInt();
        System.out.println("Türkçe notunuzu giriniz");
        int not3 = in.nextInt();
        System.out.println("Tarih notunuzu giriniz");
        int not4 = in.nextInt();
        System.out.println("Müzik notunuzu giriniz");
        int not5 = in.nextInt();
        int ortalama = (not+not1+not2+not3+not4+not5)/6;
        System.out.println("ortalama : "+ortalama);
        int sonuc =(ortalama >=60)? 1:0;
        System.out.println((sonuc ==1)? "geçti":"kaldı");
    }
}
