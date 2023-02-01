import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int count = 0;
        boolean inputExists = scanner.hasNextInt();
        int input = scanner.nextInt();

        while (input > 0) {
            int nextNumber = scanner.nextInt();
            count++;
            if (nextNumber == 0) break;
        }
        System.out.println("\n" + count);
    }
}
