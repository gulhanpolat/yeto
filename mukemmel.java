import java.util.Scanner;

public class mukemmel {
    public static void main(String[] args) {
        int muk =0;
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = input.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                 muk = muk +i;
            }
        }
        if (muk== sayi){
            System.out.println(sayi+" Mükemmel sayıdır");
        }else {
            System.out.println(sayi+" mükemmel sayi degildir");
        }
    }
}