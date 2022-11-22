public class Main {
    public static void main(String[] args) {
        //Stringler bir karakter dizisidir. char arraydir ve içerisindeki elemanların hepsi tek tek mevcuttur.
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman Sayısı : "+mesaj.length()); // Eleman yani karakter sayısı verecek. Harf ve boşlukları sayar ve ekrana yazar.
        System.out.println("5. Eleman : "+mesaj.charAt(4));//String ifadenin 5. eleman yani harfi bul der. 0'dan başlanır
        System.out.println(mesaj.concat(" Yaşasın!"));//Concat mesajı iki metni birleştir komutudur.
        System.out.println(mesaj.startsWith("A")); //startsWith komutu metnin başlangıç karakterini sorgular. Burada A ile başlıyor mu diye sorar ve false cevabını alır.
        System.out.println(mesaj.endsWith(".")); // endsWith komutu da metnin sonunu sorgular. Burada noktayla bitiyor mu diye soruyor ve true cevabını alır. Küçük büyük harf olması da doğruluğu etkiler.
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0); //Karakterleri al komutu.0-5 karakter aralığındadır çünkü 5'i saymadan karakteri çıkarıyor, karakterlerden al ve en sonki 0. karakterden aktarmaya başla demektir.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("v")); // Baştan arayarak Belirtilen karakter veya metnin kaçıncı sırada olduğunu belirtir. ilk bulduğu a'yı kabul eder diğerini önemsemez.
        System.out.println(mesaj.lastIndexOf("a")); //Sondan aramaya başlayarak karakteri arar. Burada a'yı 9. sırada buldu ve atadı.
    }
}
