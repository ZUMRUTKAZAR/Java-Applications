public class Odev11 {
    public static void main(String[] args) {
        String mesaj = "Bugun Hava Çok Güzel";
        System.out.println(mesaj);
        System.out.println("Eleman sayısı=" + mesaj.length());
        System.out.println("5.Eleman=" + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("B"));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.lastIndexOf('a'));
        String yeniMesaj=mesaj.replace( ' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2));

        for(String kelime:mesaj.split(" ")){
            System.out.println(kelime);

        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}