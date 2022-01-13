package West2PTATest;

import java.util.Scanner;

/**
 * @author: create by Anxiu
 * @version: v1.0
 * @description: West2PTATest
 * @date:2022/1/10
 **/
public class Q7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputTime = scanner.nextLine();
        scanner.close();
        transTimeFormat(inputTime);
    }

    public static void transTimeFormat(String inputTime) {

        String[] strings = inputTime.split(":");
        int inputHours = Integer.parseInt(strings[0]);
        int inputMinutes = Integer.parseInt(strings[1]);

        if (inputHours > 12) {
            System.out.println(inputHours - 12 + ":" + inputMinutes + " PM");
        } else if (inputHours == 12) {
            System.out.println(inputHours + ":" + inputMinutes + " PM");
        } else {
            System.out.println(inputHours + ":" + inputMinutes + " AM");
        }

    }

}
