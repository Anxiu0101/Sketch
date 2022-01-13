package West2PTATest;

import java.util.Scanner;

/**
 * @author: create by Anxiu
 * @version: v1.0
 * @description: West2PTATest
 * @date:2022/1/10
 **/
public class Q11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        calcBill(input);
    }

    public static void calcBill(int input) {
        double result;
        if (input <= 15) {
            result = 4 * input / 3;
        } else {
            result = 2.5 * input - 17.5;
        }
        System.out.printf("%.2f", result);
    }

}
