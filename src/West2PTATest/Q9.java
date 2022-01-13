package West2PTATest;

import java.util.Scanner;

/**
 * @author: create by Anxiu
 * @version: v1.0
 * @description: West2PTATest
 * @date:2022/1/10
 **/
public class Q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        findBall(a, b, c);
    }

    public static void findBall(int a, int b, int c) {

        if (b == a) {
            System.out.println("C");
        } else if (b == c) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

    }

}
