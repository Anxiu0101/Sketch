package West2PTATest;

import java.util.Scanner;

/**
 * @author: create by Anxiu
 * @version: v1.0
 * @description: West2PTATest
 * @date:2022/1/9
 **/
public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_cm = scanner.nextInt();
        scanner.close();
        calcFootInch(input_cm/100.0);
    }

    public static void calcFootInch (double input_m) {

        int output_foot;
        int output_inch;

        output_foot = (int) (input_m/(0.3048));
        output_inch = (int) ((input_m/(0.3048))%1*12);

        System.out.println(output_foot + " " + output_inch);
    }

}
