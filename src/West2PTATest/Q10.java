package West2PTATest;

import java.util.Scanner;

/**
 * @author: create by Anxiu
 * @version: v1.0
 * @description: West2PTATest
 * @date:2022/1/10
 **/
public class Q10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();
        int workTimeOfWeek = scanner.nextInt();
        scanner.close();
        calcSalary(years, workTimeOfWeek);

    }

    public static void calcSalary(int years, int workTime) {
        double result;
        if (years >= 5) {
            if (workTime > 40) {
                result = (workTime-40)*1.5*50 + 40*50;
            } else {
                result  = workTime*50;
            }
        } else {
            if (workTime > 40) {
                result = (workTime-40)*1.5*30 + 40*30;
            } else {
                result  = workTime*30;
            }
        }
        System.out.printf("%.2f", result);
    }

}
