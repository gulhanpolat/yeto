import java.util.Scanner;

public class artik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("yıl Giriniz");
        int yil = input.nextInt();
        int artik = yil%4;
        if (artik == 0){
            if (yil%100==0){
                if (yil%400 ==0){
                    System.out.println(yil+ " bir artık yıldır!");
                }else{
                    System.out.println(yil+ " bir artık yıl degildir !");
                }

            }else{
                System.out.println(yil+ " bir artık yıldır");
            }
        }else{
            System.out.println(yil+ " bir artık yıl degildir !");
        }
    }
}
