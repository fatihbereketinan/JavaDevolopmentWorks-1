public class Main {
    public static void main(String[] args) {
        // double [] myList = new double [4]; arraylari yazmanın diğer yöntemi
        double [] myList = {1.2,1.3,4.3,5.6};
        double total=0; // değişken tanımlıyoruz
        double max = myList [0]; //myList'in en büyük elemanını 0. eleman olarak tanımlarız

        for (double number:myList) { //myList içerisindeki sayıları gez
            if(max<number) { // O andaki sayı myListteki diğer sayılardan küçükse en büyük sayı değişir.
                max=number;
                // O andaki max sayısı myListteki diğer sayılardan küçükse max sayısı değişir.
            }
            total = total + number;
            System.out.println(number); //sayıları ekrana yaz komutu
        }

        System.out.println("Sayıların Toplamı = "+ total);
        System.out.println("En Büyük Sayı = " + max);
    }
}
