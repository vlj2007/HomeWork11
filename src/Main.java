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
        if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int os = 0;
        int ageDevice = LocalDate.now().getYear();
        inputTypeOS(os, ageDevice);

    }

    public static void overcomeTheDistance(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день.");
        } else if (deliveryDistance >= 21 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance >= 61 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка нет производится");
        }
    }

    public static void task3() {
        int deliveryDistance = 10;
        overcomeTheDistance(deliveryDistance);
    }
}