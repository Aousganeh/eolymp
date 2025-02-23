import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        double width = scanner.nextDouble();
        double length = scanner.nextDouble();
        double radiatorCapacity = scanner.nextDouble();

        double requiredRadiators = (height * width * length) / radiatorCapacity;
        long totalRadiators = (requiredRadiators == Math.floor(requiredRadiators)) ?
                (long) requiredRadiators : (long) requiredRadiators + 1;

        System.out.println(totalRadiators);
        scanner.close();
    }
}
