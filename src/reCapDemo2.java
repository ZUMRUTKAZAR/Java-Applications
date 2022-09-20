public class reCapDemo2 {
    public static void main(String[] args) {
        double[] myList = {1.2, 1.3, 4.3, 5.6}; //  double [] myList = new double [4]
        double total = 0;
        double enBuyukSayi = myList[0];

        for (double number : myList) { //mylist içerisindekii sayıları gez diyoruz.
            if (enBuyukSayi < number) {
                enBuyukSayi = number;
            }
            total = total + number; // myList içerisindeki numberları topluyoruz.
            System.out.println(number);
        }

        System.out.println("Toplam:" + total);
        System.out.println("En büyük sayi:" + enBuyukSayi);

    }
}