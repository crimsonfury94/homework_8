package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class Main {
    public static void printLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " это високосный год");
        } else {
            System.out.println(year + " это не високосный год");
        }
    }

    public static void getClientOsAndYear(String name, int year) {
        if (name.equals("IOs") && year >= 2015) {
            System.out.println("Установите версию для " + name + " по ссылке");
        } else if (name.equals("IOs") && year < 2015) {
            System.out.println("Установите облегченную версию для " + name + " по ссылке");
        } else if (name.equals("Android") && year >= 2015) {
            System.out.println("Установите версию для " + name + " по ссылке");
        } else if (name.equals("Android") && year < 2015) {
            System.out.println("Установите облегченную версию для " + name + " по ссылке");
        }
    }

    public static String getDeliveryDistance(int distance) {
        if (distance <= 20) {
            return "Для доставки потребуется один день";
        } else if (distance >= 20 && distance <= 60) {
            return "Для доставки потребуется два дня";
        } else if (distance >= 60 && distance <= 100) {
            return "Для доставки потребуется три дня";
        } else {
        }
        return "Доставка невозможна";
    }

    public static void getDuplicate(String str) {
        int i = 0;
        int j = i + 1;
        if (str.charAt(i) < str.charAt(j)) {
            System.out.println("Нет дублирующих символов");
        }
        for (i = 0; i < str.length(); i++) {
            for (j = i + 1; j < str.length(); ) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("Обнаружен дублирующий символ " + str.charAt(i));
                }
                break;
            }
        }
    }


    public static void getReverse(int[] numbers) {
        for (int i = numbers.length; i >= 0; i--) {
            if (i < numbers.length) {
                System.out.print(numbers[i] + " ");
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("#Задание 1#");
        printLeapYear(2021);
        System.out.println("#Задание 2#");
        getClientOsAndYear("IOs", 2011);
        System.out.println("#Задание 3#");
        System.out.println(getDeliveryDistance(26));
        System.out.println("#Задание 4#");
        String str = "aabccddefgghiijjkk";
        getDuplicate(str);
        System.out.println("#Задание 5#");
        int[] numbers = {3, 2, 1, 6, 5};
        getReverse(numbers);
    }
}