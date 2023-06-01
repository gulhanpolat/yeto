import javax.swing.text.Style;
import java.util.Scanner;

public class en {
    public static void main(String[] args) {
        int enB= 0, enK=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı girecekseniz:");
        int sayi = input.nextInt();


        for (int i=1; sayi>=i ;i++){
            System.out.println(i+". sayıyı giriniz:");
            int sayi1 = input.nextInt();
            if (sayi1>enB){
                enB= sayi1;
            }else if(sayi1<enK){
                enK = sayi1;
            }

        }
        System.out.println("En küçük eleman: "+enK);
        System.out.println("en büyük eleman: "+enB);
    }
}
