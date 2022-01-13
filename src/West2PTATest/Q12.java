package West2PTATest;

import java.util.Scanner;

/**
 * @author: create by Anxiu
 * @version: v1.0
 * @description: West2PTATest
 * @date:2022/1/11
 **/
public class Q12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        char calcType = scanner.next().charAt(0);
        int b = scanner.nextInt();
        scanner.close();
        simpleCalc(a, calcType, b);
    }

    public static void simpleCalc(int a, char calcType, int b) {
        switch (calcType) {
            case '+':
                System.out.println(a+b);
                break;

            case '-':
                System.out.println(a-b);
                break;

            case '*':
                System.out.println(a*b);
                break;

            case '/':
                System.out.println(a/b);
                break;

            case '%':
                System.out.println(a%b);
                break;

            default:
                System.out.println("ERROR");
                break;
        }
    }

}
