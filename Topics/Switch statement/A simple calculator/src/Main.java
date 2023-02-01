import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long firstNumber = scanner.nextLong();
        String operation = scanner.next();
        long secondNumber = scanner.nextLong();
        long result;
        if (secondNumber != 0) {
            switch (operation) {
                case "+" -> {
                    result = firstNumber + secondNumber;
                    System.out.println(result);
                }
                case "-" -> {
                    result = firstNumber - secondNumber;
                    System.out.println(result);
                }
                case "/" -> {
                    result = firstNumber / secondNumber;
                    System.out.println(result);
                }
                case "*" -> {
                    result = firstNumber * secondNumber;
                    System.out.println(result);
                }
                default -> System.out.println("Unknown operator");
            }
        } else {
            System.out.println("Division by 0!");
        }
    }
}