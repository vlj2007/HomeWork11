import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void showYears(int year) {
        if (year % 4 == 0 && year % 100 != 0 && year % 400 != 0) {
            System.out.println("Високосный год " + year);
        } else {
            System.out.println("Невисокосный год " + year);
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 1982;
        showYears(year);
    }


}