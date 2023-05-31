// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double metre, kitle;
        int kg;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz:");
        metre= input.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz:");
        kg = input2.nextInt();
        kitle = kg/(metre *metre);
        System.out.println("vücut kitle indeksiniz:"+kitle);
    }
}