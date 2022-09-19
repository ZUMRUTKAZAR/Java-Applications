public class Odev5 {
    public static void main(String[] args) {
        // Switch blokları
        char grade = 'a';
        switch (grade) {
            case 'A':
                System.out.println("Mükkemmel: Geçtiniz.");
                break;
            case 'B':
                System.out.println("Çok iyi: Geçtiniz.");
                break;
            case 'C':
                System.out.println("İyi: Geçtiniz.");
                break;
            case 'D':
                System.out.println("Fena değil: Geçtiniz.");
                break;
            case 'E':
                System.out.println("Maalesef Kaldınız.");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");


        }
    }
}
