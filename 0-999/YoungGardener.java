import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int layers = scanner.nextInt();
        int totalLeaves = 1, leavesInLayer = 2;

        for (int i = 0; i < layers; i++) {
            totalLeaves += leavesInLayer;
            leavesInLayer += 2;
        }

        System.out.println(totalLeaves);
        scanner.close();
    }
}
