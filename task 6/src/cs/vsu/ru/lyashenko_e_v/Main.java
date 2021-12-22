package cs.vsu.ru.lyashenko_e_v;

import java.util.Scanner;

public class Main {

    public static double sum1(double x, int n) {
        return sum2(x, 0, n);
    }


    public static double sum2(double x, double e, int n) {

        double sum = -x;
        double an = -x;

        for (int i = 2; i <= n; i++) {
            an = an * x * (i - 1) / i;
            sum += (an > e) ? an : 0;
        }

        return sum;
    }

    public static double sum3(double x, double e, int n) {
        return sum2(x, e / 10, n);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = input.nextDouble();
        System.out.print("Введите n: ");
        int n = input.nextInt();
        System.out.print("Введите e: ");
        double e = input.nextDouble();

        System.out.println("Сумма n слагаемых: " + sum1(x, n));
        System.out.println("Сумма слагаемых > e: " + sum2(x, e, n));
        System.out.println("Сумма слагаемых > e / 10: " + sum3(x, e, n));

        double an = Math.log(1 - x);
        System.out.println("ln(1-x) = " + Math.exp(an));

    }
}
