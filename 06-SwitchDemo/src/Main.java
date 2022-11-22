public class Main {
    public static void main(String[] args) {
        char grade = 'F';

        switch(grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz"); //B ve C sonuçları aynı ise case leri artarda sıralar ve ondan sonra sys.out yazılır.
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef : Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz!");
        }
    }
}
