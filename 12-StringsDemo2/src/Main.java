public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        //System.out.println(mesaj.replace(' ', '-')); yazabiliriz.Ancak aşağıdaki gibi yaparak kodun devamında gerekli olması durumunda tekrar kullanabiliriz.
        String yeniMesaj = mesaj.replace(' ', '-'); //boşluk eski '-' yeni değerdir
        System.out.println(yeniMesaj);

        System.out.println("---------------");

        System.out.println(mesaj.substring(2)); //Substring görevi bir metnin içerisinden parça almaktır. Mesajın 2. indeksinden itibaren kes demek
        System.out.println(mesaj.substring(2,5)); // Substring Sıklıkla kullanılır. Diğer kullanım yönü budur. Aralık vererek metnin istenen kısmından parça almaktır

        System.out.println("---------------");

        for (String kelime : mesaj.split(" ")) { // Split komutu belli bir karakter dizisini parçalamaya yarar yani her kelimeyi tek tek ve alt alta yazar.
            System.out.println(kelime);
        }

        System.out.println("---------------");

        System.out.println(mesaj.toLowerCase()); //Kaynaktaki mesajın bütün harflerini küçük harfe çevirir.
        System.out.println(mesaj.toUpperCase()); //Kaynaktaki mesajın bütün harflerini büyük harfe çevirir.

        System.out.println(mesaj.trim()); // trim fonksiyonu mesajın başındaki ve sonundaki boşluğu yok eder ve aradan çıkararak mesajı düzenler.
    }
}
