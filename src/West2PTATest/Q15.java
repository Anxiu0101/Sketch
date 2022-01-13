package West2PTATest;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author: create by Anxiu
 * @version: v1.0
 * @description: West2PTATest
 * @date:2022/1/12
 **/
public class Q15 {

    static double PI_half = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double threshold = scanner.nextDouble();
        scanner.close();
        calcPI(threshold);
    }

    public static void calcPI(double threshold) {

        double temp = 1.0;
        int n = 1;

        while (temp >= threshold) {
            temp = (double)calcFactorial(n-1)/calcOddFactorial(n);
            PI_half = (PI_half + temp);
            n++;
        }

        System.out.printf("%.6f", PI_half*2);

    }

    public static int calcFactorial(int n) {

        if (n == 0) {
            return 1;
        }

        return n * calcFactorial(n-1);
    }

    public static int calcOddFactorial(int n) {

        if (n == 0) {
            return 1;
        }

        return (2*n - 1) * calcOddFactorial(n-1);

    }

}
