import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int element = scanner.nextInt();
        while (element > 1) {
            System.out.print(element + " ");
            if (element % 2 == 0) {
                element /= 2;
            } else {
                element *= 3;
                element++;
            }
        }
        System.out.print(element);
    }
}