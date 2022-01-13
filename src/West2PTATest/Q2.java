package West2PTATest;

import java.util.Scanner;

/**
 * @author: create by Anxiu
 * @version: v1.0
 * @description: West2PTATest
 * @date:2022/1/9
 **/
public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentTime = scanner.nextInt();
        int passingMinute = scanner.nextInt();
        scanner.close();
        calcTime(currentTime, passingMinute);
    }

    public static void calcTime(int currentTime, int passingMinute) {

        int currentHour = currentTime / 100;
        int currentMinute = currentTime % 100;

        currentHour = currentHour + (passingMinute / 60);
        currentMinute = currentMinute + (passingMinute % 60);
        if (currentMinute >= 60) {
            currentHour++;
            currentMinute = currentMinute - 60;
        }

//        if (currentHour == 0) {
//            if (currentMinute < 10) {
//                System.out.println("00" + currentMinute);
//            } else {
//                System.out.println("0" + currentMinute);
//            }
//        } else {
//            int resultTime = currentHour*100 + currentMinute;
//            System.out.println(resultTime);
//        }

        System.out.printf("%01d%02d",currentHour, currentMinute);
    }

}
