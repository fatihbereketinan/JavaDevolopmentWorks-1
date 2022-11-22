public class Main {
    public static void main(String[] args) {
        // For Döngüsü
        for(int i=1; i<=10; i++) {  // i++ ve i+1 ikiside aynı ve kullanabiliriz.
            System.out.println(i); //i+=2 yaparak tek sayıları sayar. Ancak eğer i=2 olursa çift sayıları sayar.
        }

        System.out.println("For Döngüsü Burada Sonlandı");


        // While Döngüsü

        //For döngüsüyle aynı şeydir. Ancak For döngüsü daha çok tercih edilir.
        int i=2; // i'yi tanımlamazsak while döngüsü olmaz. While i'yi için ayrıca tanımlarız
        while(i<10) {
            System.out.println(i);
            i+=2;  // Eğer yazmazsak infinite loop yani sonsuz döngü olur ve makine sürekli aynı sayıda kalır ve sonsuz kere sayar.

        }

        System.out.println("While Döngüsü Burada Sonlandı");


        //Do-While Döngüsü

        //Çok kullanılan bir döngü tipi değildir.
        int j=100; // i main'in içinde tanımlıdır.Bu yüzden j değişkeni olarak tanımlanır.
        do {  //Kod While döngüsünde kendi içerisinde ancak Do-While döngüsünde Do içerisindedir>
            System.out.println(j);
            j+=2;
        } while(j<10); //j=100 olsaydı önce do çalıştığı için 100 yazılır ve 10'dan büyük olduğu döngü devam etmezdi.

        System.out.println("Do-While Döngüsü Burada Sonlandı");
    }
}
