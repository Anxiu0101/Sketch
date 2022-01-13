package West2PTATest;

import java.util.Scanner;

/**
 * @author: create by Anxiu
 * @version: v1.0
 * @description: West2PTATest
 * @date:2022/1/11
 **/
public class Q13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double openPrice = scanner.nextDouble();
        double highPrice = scanner.nextDouble();
        double lowPrice = scanner.nextDouble();
        double closePrice = scanner.nextDouble();
        scanner.close();
        decideImgType(openPrice, closePrice, highPrice, lowPrice);
    }

    public static void decideImgType(double open, double close, double high, double low) {

        if (close < open) {
            System.out.print("BW-Solid");
        } else if (close > open) {
            System.out.print("R-Hollow");
        } else {
            System.out.print("R-Cross");
        }

        if (low < open && low < close) {
            System.out.print(" with Lower Shadow");
            if (high > open && high > close) {
                System.out.print(" and Upper Shadow");
            }
        } else if (high > open && high > close) {
            System.out.println(" with Upper Shadow");
        } else {
            System.out.println();
        }


    }

}
