package West2PTATest;

import java.util.Scanner;

/**
 * @author: create by Anxiu
 * @version: v1.0
 * @description: West2PTATest
 * @date:2022/1/10
 **/
public class Q6 {

    public static void main(String[] args) {

        // Input
        Scanner scanner = new Scanner(System.in);
        double input1 = scanner.nextDouble();
        int input2 = scanner.nextInt();
        char input3 = scanner.next().charAt(0);
        float input4 = scanner.nextFloat();
        scanner.close();

        // Print
        System.out.print(input3 + " " + input2 + " "
                            + input1 + " ");
        System.out.printf("%.2f", input4);
    }

}
