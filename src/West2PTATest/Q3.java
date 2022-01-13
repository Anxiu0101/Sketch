package West2PTATest;

import java.util.Scanner;

/**
 * @author: create by Anxiu
 * @version: v1.0
 * @description: West2PTATest
 * @date:2022/1/9
 **/
public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        printReverse(input);
    }

    public static void printReverse(int input) {
        System.out.println((input%10)*100 + (input%100/10)*10 + (input/100));
    }

}
