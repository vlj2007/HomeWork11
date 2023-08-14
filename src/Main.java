import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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

    public static void inputTypeOS(int clientOS, int clientDeviceYear) {
        int deviceAgeLimit = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear <= deviceAgeLimit) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear <= deviceAgeLimit) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int os = 0;
        int ageDevice = 2012;
        inputTypeOS(os, ageDevice);

    }

    public static int overcomeTheDistance(int deliveryDistance, int day) {
        if (deliveryDistance <= 20) {
            day = day + 1;
            System.out.println("Потребуется день: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = day + 2;
            System.out.println("Потребуется день: " + day);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day = day + 3;
            System.out.println("Потребуется дня: " + day);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка нет производится");
        }
        return day;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 43;
        int day = 0;
        overcomeTheDistance(deliveryDistance, day);
    }
}