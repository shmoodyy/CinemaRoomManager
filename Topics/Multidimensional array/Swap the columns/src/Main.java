import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int column1, column2;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] numberMatrix = new int[n][m];

        for (int i = 0; i < numberMatrix.length && numberMatrix.length <= 100; i++) {
            for (int j = 0; j < numberMatrix[i].length && numberMatrix[i].length <= 100; j++) {
                numberMatrix[i][j] = scanner.nextInt();
            }
        }

        column1 = scanner.nextInt();
        column2 = scanner.nextInt();
        for (int i = 0; i < numberMatrix.length && numberMatrix.length <= 100; i++) {

            for (int j = 0; j < numberMatrix[i].length; j++) {

                if (j == column1) {
                    System.out.print(numberMatrix[i][column2] + " ");
                    continue;
                }
                if (j == column2) {
                    System.out.print(numberMatrix[i][column1] + " ");
                    continue;
                }
                System.out.print(numberMatrix[i][j] + " ");
            }

            System.out.println();
        }

    }
}