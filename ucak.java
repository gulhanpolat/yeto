import java.util.Scanner;
public class ucak {
    public static void main(String[] args) {
        double indirimO, indirimY, indirimT, indirim;
        Scanner in = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz :");
        int km = in.nextInt();

        System.out.println("yaşınızı giriniz :");
        int yas = in.nextInt();

        System.out.println("Yolculuk tipini giriniz(1=> Tek Yön , 2 => Gidiş Dönüş):");
        int tip = in.nextInt();

        double tutar = km* 0.10;
        double yst;
        if(km<0 || yas<0){
            System.out.println("hatalı veri girdininz");
        }else{
            switch (tip){
                case 1: {
                    if (yas<12){
                        indirimO= tutar*0.5;
                        indirimY= tutar -indirimO;
                        System.out.println("Toplam ücret :"+indirimY);
                    }else if(yas<=24){
                        indirimO = tutar*0.1;
                        indirimY = tutar- indirimO;
                        System.out.println("toplam tutuar :"+indirimY);
                    } else if (yas>65) {
                        indirimO = tutar*0.3;
                        indirimY = tutar- indirimO;
                        System.out.println("Toplam tutar :"+ indirimY);
                    }else{
                        System.out.println("Toplam tutar :"+ tutar);
                    }
                    break;
                }
                case 2:{
                    if (yas<12){
                        indirimO= tutar*0.5;
                        indirimY= tutar -indirimO;
                        indirimT = indirimY* 0.20;
                        System.out.println("Toplam ücret :"+indirimT);
                    }else if(yas<=24){
                        indirimO = tutar*0.1;
                        indirimY = tutar- indirimO;
                        indirimT = indirimY* 0.20;
                        System.out.println("toplam tutuar :"+indirimT);
                    } else if (yas>65) {
                        indirimO = tutar*0.3;
                        indirimY = tutar- indirimO;
                        indirimT = indirimY* 0.20;
                        System.out.println("Toplam tutar :"+ indirimT);
                    }else {
                        indirim = tutar- tutar*0.2;
                        System.out.println("Toplam tutar :"+indirim);
                    }

                    break;
                }
                default:
                    System.out.println("Hatalı Veri Girdiniz! ");
            }
        }
    }
}
