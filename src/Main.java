import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoriyelini hesaplamak istediğiniz sayıyı girin: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Lütfen sayı giriniz");
            return;
        }
        int num = scanner.nextInt();
        int carpim = 1;
        for (int i = 1; i <= num; i++) {
            carpim *= i;
        }
        System.out.println("Faktoriyel değeriniz: " + carpim);
    }
}
