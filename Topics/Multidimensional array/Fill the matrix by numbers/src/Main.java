import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] numberMatrix = new int[n][n];

        for (int i = 0; i < numberMatrix.length; i++) {
            for (int j = 0; j < numberMatrix[i].length; j++) {
                numberMatrix[i][j] = Math.abs(i - j);
                System.out.print(numberMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
