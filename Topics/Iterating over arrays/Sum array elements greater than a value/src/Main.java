import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // put your code here
//        Scanner scanner = new Scanner(System.in);
//
//        int numberThreshold;
//        int sum = 0;
//        int size = scanner.nextInt();
//        int[] numArray = new int[size];
//
//        for (int i = 0; i < numArray.length; i++) {
//            numArray[i] = scanner.nextInt();
//        }
//
//        numberThreshold = scanner.nextInt();
//        for (int num : numArray) {
//            if (num > numberThreshold) {
//                sum += num;
//            }
//        }
//        System.out.println(sum);


        int[][][] threeDimArray = new int[2][3][4];

        int element = 0;

        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                for (int k = 0; k < threeDimArray[i][j].length; k++) {
                    threeDimArray[i][j][k] = element;
                }
                element++;
            }
        }


        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                System.out.print(Arrays.toString(threeDimArray[i][j]) + " ");
            }
            System.out.println();
        }



//        int[][] twoDimArray = new int[2][10];
//
//        for (int i = 0; i < twoDimArray.length; i++) {
//            for (int j = 0; j < twoDimArray[i].length; j++) {
//                twoDimArray[i][j]++;
//                System.out.print(twoDimArray[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < twoDimArray.length; i++) {
//            for (int j = 0; j < twoDimArray[i].length; j++) {
//                twoDimArray[i][j]++;
//                System.out.print(twoDimArray[i][j] + " ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < twoDimArray.length; i++) {
//            System.out.println(Arrays.toString(twoDimArray[i]));
//        }

    }
}