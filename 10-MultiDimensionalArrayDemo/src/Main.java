public class Main {
    public static void main(String[] args) {
        String[] [] sehirler = new String[3] [3];
        //3'lü yada daha fazla dizili şekilde de yapabiliriz.
        //[3] [2] li değişkenli dizide olabilir.

        sehirler[0] [0] = "İstanbul"; // 0'dan başladığımız için [2] [2]'de biter
        sehirler[0] [1] = "Bursa";    // ilki satır diğeri sütundur.
        sehirler[0] [2] = "Bilecik";  //Bölgeler ve oradaki şehirler olarak düşünelim. Marmara, iç anadolu ve güneydoğu anadolu diye
        sehirler[1] [0] = "Ankara";
        sehirler[1] [1] = "Konya";
        sehirler[1] [2] = "Kayseri";
        sehirler[2] [0] = "Diyarbakır";
        sehirler[2] [1] = "Şanlıurfa";
        sehirler[2] [2] = "Gaziantep";

        for(int i=0; i<=2;i++) {
            System.out.println("----------------------"); // her satır arasına çizgi çekerek belirginleştirdik.
            for(int j=0;j<=2;j++) {
                System.out.println(sehirler[i] [j]);
            }
        }
    }
}
