public class asal {
    public static void main(String[] args) {
        for (int i=2;i<=100;i++){
            boolean kontrol= true;
            for(int j=2;j<i;j++){
                if (i%j==0){
                    kontrol = false;
                }
            }
            if (kontrol ==true){
                System.out.print(i+" ");
            }
        }
    }
}
