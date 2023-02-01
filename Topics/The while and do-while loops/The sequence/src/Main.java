import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int max = 0;
        int four = 4;
        int elementCount = scanner.nextInt();
        while (scanner.hasNextInt()) {
            int element = scanner.nextInt(); // IMPORTANT!! ALWAYS CHECK THEN READ DONT READ THEN CHECK.
            if (element % four == 0 && max < element) {
                max = element;
            }
        }
        System.out.print(max);
    }
}