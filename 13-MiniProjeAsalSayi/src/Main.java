public class Main {
    public static void main(String[] args) {
        int number = 5;
        int remainder = number % 2; //Number daki değeri 2'ye böl ve kalanı hesapla
        System.out.println(remainder); // Sayının 2 ile bölümünden kalanı ekrana yaz
        boolean isPrime = true;

        if(number==1) {
            System.out.println("Sayı Asal Sayı Değildir");
            return;
        }
        if(number<2) {
            System.out.println("Bu Geçersiz Bir Sayıdır.");
        }

        for (int i=2; i<number; i++) {
            if(number % i == 0) {
                isPrime = false;


            }
        }

        if (isPrime) { //isPrime==true koşulu yazmakla isPrime demekle aynı şeydir.
            System.out.println("Sayı Asal Sayıdır.");
        }else {
            System.out.println("Sayı Asal Sayı Değildir.");
        }
    }
}
