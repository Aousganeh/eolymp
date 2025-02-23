import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPassengers = scanner.nextInt() - 1;
        int startTicketNumber = scanner.nextInt() + 1;
        int divisorCount = 0;

        for (int currentTicket = startTicketNumber; currentTicket <= startTicketNumber + numberOfPassengers; currentTicket++) {
            for (int divisor = 1; divisor <= currentTicket; divisor++) {
                if (currentTicket % divisor == 0) {
                    divisorCount++;
                }
            }
            if (divisorCount == 2) {
                System.out.println(currentTicket - startTicketNumber);
                break;
            }
            divisorCount = 0;

            if (currentTicket == startTicketNumber + numberOfPassengers - 1 || numberOfPassengers == 0) {
                System.out.println("-1");
                break;
            }
        }
    }
}
