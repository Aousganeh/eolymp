import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dimensions = scanner.nextLine();
        var dimensionArray = dimensions.split(" ");
        long rows = Long.parseLong(dimensionArray[0]);
        long columns = Long.parseLong(dimensionArray[1]);
        System.out.println((rows - 1) * (columns - 1) + 1);
    }
}
