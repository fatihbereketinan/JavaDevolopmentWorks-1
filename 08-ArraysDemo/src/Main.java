public class Main {
    public static void main(String[] args) {
        String ogrenci1="Engin";
        String ogrenci2="Derin";
        String ogrenci3="Salih";
        String ogrenci4="Ahmet";//Yeni öğrenci eklemek bu yöntemle zorlaşır.
//Burada öğrencileri ekrana yazdırmak istiyorum ama tek tek yazmak zorundayım.

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------"); //Karşılaştırma için ayırma çizgisi gibi kullandık.

        // String dizisi girerek öğrencileri yazarız ve kodu daha doğru şekilde yazarız
        String[] ogrenciler = new String[4];
        ogrenciler[0]="Engin"; // İlk eleman yani indeksler 0 ile başlar. öğrencilerin 0. elemanı engin
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Ahmet";
        //ogrenciler[4]="Ali";burada 4. bir öğrenci eklersek hata verir. Dizi sayısı 4 eleman ancak 5. eleman olunca sınırların dışında olduğu için dizi hata verir

        for (int i=0;i<ogrenciler.length;i++) { //i sıfıra eşit ve öğrecilerin eleman sayısından küçük olacak
            System.out.println(ogrenciler[i]);  //length öğrenci sayısı
        }
        System.out.println("-----------------");

        for (String ogrenci:ogrenciler) { //üstteki for döngüsü yerine farklı olarak bu for döngüsüde genel olarak kullanılır.
            System.out.println(ogrenci);  //Burada öğrenciler dizisindeki bütün elemanları gez. ogrenci:ogrenciler kısmındaki ogrenci kısmına istediğini yazabilirsin.
        }
    }
}
