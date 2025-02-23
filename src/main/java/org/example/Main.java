package org.example;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

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


//    Метод для поиска двух максимальных чисел
    public static int[] findMax(int... values) {
        if (values.length < 2) {
            return null;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < values.length; i++) {
            if (values[i] > max1) {
                max2 = max1;
                max1 = values[i];
            }
            else if (values[i] > max2) {
                max2 = values[i];
            }
        }

        return new int[] {max1, max2};
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

//        Создать метод который принимает неограниченное количество чисел и среди всех ищет большее
    }

    public static void task4() {
        System.out.println("Наименьшее положительное значение double: " + Math.nextUp(0.0));

        System.out.println("Наибольшее положительное значение double: " + Double.MAX_VALUE);

        System.out.println(Math.nextUp(Double.MAX_VALUE) > Double.MAX_VALUE);
        System.out.println(Math.nextUp(Double.MAX_VALUE));
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

    public static void task13() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }

        ArrayList<Integer> lotteryCombination = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int randomIndex = random.nextInt(numbers.size());
            lotteryCombination.add(numbers.remove(randomIndex));
        }

        Collections.sort(lotteryCombination);
        System.out.println("Лотерейная комбинация: " + lotteryCombination);
    }

    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;

        for (int[] row : matrix) {
            if (row.length != n) {
                return false;
            }
        }

        int sum = 0;
        for (int num : matrix[0]) {
            sum += num;
        }

        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int num : matrix[i]) {
                rowSum += num;
            }
            if (rowSum != sum) {
                return false;
            }
        }

        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != sum) {
                return false;
            }
        }

        int diagSum1 = 0;
        for (int i = 0; i < n; i++) {
            diagSum1 += matrix[i][i];
        }
        if (diagSum1 != sum) {
            return false;
        }

        int diagSum2 = 0;
        for (int i = 0; i < n; i++) {
            diagSum2 += matrix[i][n - 1 - i];
        }
        if (diagSum2 != sum) {
            return false;
        }

        return true;
    }

    public static void task14() {
        Scanner scanner = new Scanner(System.in);
        List<int[]> rows = new ArrayList<>();

        System.out.println("Введите квадратную матрицу:");
        while (true) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                break;
            }
            String[] parts = line.split("\\s+");
            int[] row = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                row[i] = Integer.parseInt(parts[i]);
            }
            rows.add(row);
        }

        int size = rows.size();
        int[][] matrix = new int[size][];
        for (int i = 0; i < size; i++) {
            matrix[i] = rows.get(i);
        }

        if (isMagicSquare(matrix)) {
            System.out.println("Массив является магическим квадратом.");
        } else {
            System.out.println("Массив не является магическим квадратом.");
        }
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long binomialCoefficient(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static long findMaxInTriangle(int n) {
        int k = n / 2;
        return binomialCoefficient(n, k);
    }

    public static ArrayList<ArrayList<Integer>> generatePascalTriangle(int n) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();

            row.add(1);

            if (i > 0) {
                ArrayList<Integer> prevRow = triangle.get(i - 1);
                for (int j = 1; j < i; j++) {
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
                row.add(1);
            }

            triangle.add(row);
        }

        return triangle;
    }

    public static void task15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите величину n для треугольника Паскаля: ");
        int n = scanner.nextInt();

        long maxNumber = findMaxInTriangle(n - 1);
        int maxWidth = String.valueOf(maxNumber).length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ".repeat(maxWidth));
            }

            for (int k = 0; k <= i; k++) {
                long number = binomialCoefficient(i, k);
                String formattedNumber = String.format("%" + maxWidth + "d", number);
                System.out.print(formattedNumber + " ".repeat(maxWidth));
            }
            System.out.println();
        }
    }

    public static double average(double v1, double... values) {
        double sum = v1;
        for (double v : values) {
            sum += v;
        }
        return values.length == 0 ? sum : sum / (values.length + 1);
    }

//    Есть строка. В ней надо найти подстроку максимальной длины палиндром и вывести её.
//    ajgkfldgabcderedcba
//    zxxzzxcxzasd

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static String isContainPalindrome(String str) {
        int start = 0, end = 0;

        if ("".equals(str))
            return "";
        for (int i = 0; i < str.length(); i++) {
            int len1 = expandAroundCenter(str, i, i);
            int len2 = expandAroundCenter(str, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return str.substring(start, end + 1);
    }

    public static boolean isPalindrom(String word) {
        boolean flag = false;
        int length = word.length();
        int border = (length % 2 == 0) ? length / 2 : length / 2 + 1;
        int counter = 0;
        for (int i = 0; i < border; i++) {
            if (word.charAt(i) == word.charAt(length - 1 - i)) {
                counter++;
            }
        }
        if (length % 2 == 0 && counter == length / 2){
            flag = true;
        }
        else if (length % 2 != 0 && counter == length / 2 + 1){
            flag = true;
        }

        return flag;
    }

    public static String findMaxPalindrom(String str) {
        String maxWord = "";
        int maxLength = -1;

        str = str.trim();
        String[] newStr = str.split("\\s+");
        for (String word : newStr) {
            if (isPalindrom(word)) {
                if (word.length() > maxLength) {
                    maxWord = word;
                    maxLength = word.length();
                }
            }
        }

        return maxWord;
    }

    public static void main(String[] args) {
        int number = 1;

        while(number != 0) {
            System.out.print("Введите номер задачи 1 - 18 (0 - для выхода): ");
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
                case 13:
                    task13();
                    break;
                case 14:
                    task14();
                    break;
                case 15:
                    task15();
                    break;
                case 16:
                    System.out.println("Среднее чисел 1, 2, 3, 4, 5: " + average(1, 2, 3, 4, 5));
                    break;
                case 17:
                    // ajgkfldgabcderedcba
                    Scanner input = new Scanner(System.in);
                    String str = input.nextLine();
                    System.out.println(isContainPalindrome(str));
                    break;
                case 18:
                    System.out.println("Максимальное из чисел 2 7 9 12 8 16 32 22 15 30: ");
                    int[] result = findMax(1, 1, 1, 1, 2, 2);
                    System.out.println("Max1: " + result[0] + ", Max2: " + result[1]);
                    break;
                default:
                    System.out.println("Неверно!");
            }
        }
    }
}