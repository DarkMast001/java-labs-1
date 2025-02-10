package org.example;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void task1() {
        System.out.print("Введите десятичное число: ");
        Scanner in = new Scanner(System.in);
        int decimal = in.nextInt();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("Двоичное: " + binary);

        String octal = Integer.toOctalString(decimal);
        System.out.println("Восьмеричное: " + octal);

        String hex = Double.toHexString(decimal);
        System.out.println("Шестнадцатеричное: " + hex);
    }

    public static void task2() {
        System.out.print("Введите градусы: ");
        Scanner in = new Scanner(System.in);
        int degree = in.nextInt();

        int normal = (degree < 0) ? 360 + (degree % 360) : degree % 360;
        System.out.println("Нормализация '%': " + normal);

        System.out.println("Нормализация 'Math.floorMod': " + Math.floorMod(degree, 360));
    }

    public static void task3() {
        System.out.print("Введите 3 целых числа: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a >= b && a >= c)
            System.out.println("Самое большое число (условный оператор): " + a);
        else if (b >= a && b >= c)
            System.out.println("Самое большое число (условный оператор): " + b);
        else
            System.out.println("Самое большое число (условный оператор): " + c);

        System.out.println("Самое большое число (Math.max()): " + Math.max(Math.max(a, b), c));
    }

    public static void task4() {
        System.out.println("Наименьшее положительное значение double: " + Math.nextUp(0.0));

        System.out.println("Наибольшее положительное значение double: " + Double.MAX_VALUE);
    }

    public static void task5() {
        double maxDouble = 2147483647888d;
        int maxInt = (int)maxDouble;

        System.out.println("Максимальное значение double: " + maxDouble);
        System.out.println("Максимальное значение int: " + maxInt);
    }

    public static void task6() {
        BigInteger n = BigInteger.valueOf(1);

        for(BigInteger i = BigInteger.valueOf(1); i.compareTo(BigInteger.valueOf(1001)) != 0; i = i.add(BigInteger.valueOf(1))) {
            n = n.multiply(i);
        }

        System.out.println(n);
    }

    public static void task7() {
        int t1, t2;
        short s1, s2;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число в диапазоне 0 - 65535: ");
        t1 = in.nextInt();
        System.out.print("Введите второе число в диапазоне 0 - 65535: ");
        t2 = in.nextInt();
        s1 = (short) t1;
        s2 = (short) t2;

        int sum = (s1 & 0xFFFF) + (s2 & 0xFFFF);
        System.out.println("Сумма: " + sum);

        int difference = (s1 & 0xFFFF) - (s2 & 0xFFFF);
        System.out.println("Разность: " + difference);

        int product = (s1 & 0xFFFF) * (s2 & 0xFFFF);
        System.out.println("Произведение: " + product);

        int quotient = (s1 & 0xFFFF) / (s2 & 0xFFFF);
        System.out.println("Частное: " + quotient);

        int remainder = (s1 & 0xFFFF) % (s2 & 0xFFFF);
        System.out.println("Остаток: " + remainder);
    }

    public static void task8() {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        str = in.nextLine();
        String[] newStr = str.split("\\s+");
        for(String s : newStr) {
            System.out.println(s);
        }
    }

    public static void task9() {
        String s1, s2;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        s1 = in.nextLine();
        System.out.print("Введите вторую строку: ");
        s2 = in.nextLine();

        int result = s1.compareTo(s2);
        if (result == 0)
            System.out.println("Строки равны");
        else
            System.out.println("Строки разные");
    }

    public static void task10() {
        Random random = new Random();
        long randomLong = random.nextLong();

        String str = Long.toString(randomLong, 36);

        System.out.println("Произвольная строка: " + str);
    }

    public static void task11() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите произвольную строку: ");
        String str = in.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch > 127) {
                System.out.println("Символ: " + ch + ", Юникод: U+" + Integer.toHexString(ch).toUpperCase());
            }
        }
    }

    public static void main(String[] args) {
        int number = 1;

        while(number != 0) {
            System.out.print("Введите номер задачи 1 - 16 (0 - для выхода): ");
            Scanner in = new Scanner(System.in);
            number = in.nextInt();
            switch (number) {
                case 0:
                    break;
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5();
                    break;
                case 6:
                    task6();
                    break;
                case 7:
                    task7();
                    break;
                case 8:
                    task8();
                    break;
                case 9:
                    task9();
                    break;
                case 10:
                    task10();
                    break;
                case 11:
                    task11();
                    break;
                default:
                    System.out.println("Неверно!");
            }
        }
    }
}