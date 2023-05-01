import java.util.Scanner;

public class Main {
    static void asalSayi(int s) {
        int sayac=0;
        for(int i=1; i<=s;i++) {
            if(s%i==0) {
                sayac++;

            }
        }
        if (sayac==2) {
            System.out.print("Sayı asaldır.");
        }
        else {
            System.out.print("Sayı asal değildir.");
        }
    }

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi=inp.nextInt();
        asalSayi(sayi);
    }
}