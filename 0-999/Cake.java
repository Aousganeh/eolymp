import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        float harmonicSum = 0;
        String[] numbers = inputLine.split(" ");

        for (String number : numbers) {
            harmonicSum += 1 / Float.parseFloat(number);
        }

        System.out.printf("%.2f", 1.0 / harmonicSum);
    }
}
