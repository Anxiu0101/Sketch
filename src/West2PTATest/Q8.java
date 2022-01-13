package West2PTATest;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

/**
 * @author: create by Anxiu
 * @version: v1.0
 * @description: West2PTATest
 * @date:2022/1/10
 **/
public class Q8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        scanner.close();
        checkSpeed(speed);

    }

    public static void checkSpeed (int speed) {
        if (speed <= 60) {
            System.out.println("Speed: " + speed + " - OK\n");
            return;
        } else {
            System.out.println("Speed: " + speed + " - Speeding\n");
        }
    }

}
