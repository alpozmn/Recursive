import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        manipulateNumber(number);
    }

    // Recursive metot ile sayı manipülasyonu
    public static void manipulateNumber(int number) {
        System.out.println("Şu anki değer: " + number);

        if (number <= 0) {
            if (number < 0) {
                manipulateNumber(number + 5);
            } else {
                manipulateNumber(number - 5);
            }
        } else {
            manipulateNumber(number - 5);
        }
    }
}
