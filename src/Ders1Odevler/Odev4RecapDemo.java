package Ders1Odevler;

public class Odev4RecapDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = 5;
        int enBuyuk = a;

        if (enBuyuk < b) {
            enBuyuk = b;
        }
        if (enBuyuk < c) {
            enBuyuk = c;
        }
        System.out.println("EN BÜYÜK SAYI=" + enBuyuk);


    }
}