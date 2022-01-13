package West2PTATest;

import java.util.Scanner;

/**
 * @author: create by Anxiu
 * @version: v1.0
 * @description: West2PTATest
 * @date:2022/1/11
 **/
public class Q14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerBound = scanner.nextInt();
        int upperBound = scanner.nextInt();
        scanner.close();
        calcSum(lowerBound, upperBound);
    }

    public static void calcSum(int lowerBound, int upperBound) {

        int[] temp = new int[upperBound-lowerBound+1];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < temp.length; i++) {

            temp[i] = lowerBound+i;
            sum = sum + temp[i];

            if (count == 5) {
                System.out.println();
                count = 0;
            }

            if (temp[i] < 0) {
                System.out.print("   " + temp[i]);
                count++;
            } else {
                System.out.print("    " + temp[i]);
                count++;
            }

        }

        System.out.println();
        System.out.println("Sum = " + sum);
    }

}
