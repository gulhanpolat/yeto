import java.util.Scanner;

public class ucgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısı giriniz");
        int basamak = input.nextInt();
        for (int i=1;basamak>=i;i++){
            for(int j=basamak;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
