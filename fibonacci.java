import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int b=1;
        int c;
        int a =0;
        Scanner input = new Scanner(System.in);
        System.out.println("serinin eleman sayısını girniniz");
        int x = input.nextInt();
        System.out.print(a+" "+b);
        for(int i = 1;i<x;i++){
            c = a+b;
            System.out.print(" "+c);
            a=b;
            b =c;
        }
    }
}
