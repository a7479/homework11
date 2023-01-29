import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2021;// переменная для проверки високосного года

        int clientDeviceYear=2019;// год выпуска телефона
        int clientOS = 0;// тип ОС

        int deliveryDistance = 95;// расстояние

        task1(year);
        task2(clientDeviceYear,clientOS);
        task3(deliveryDistance);
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void task1(int year) {
        System.out.println("Задача 1");

        if (isLeapYear(year)) {
            System.out.println(year + " год является високосным ");
        } else {
            System.out.println(year + " год не является високосным ");
        }
    }
    public static void task2(int clientDeviceYear,int clientOS) {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear < currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < currentYear && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static int task3(int deliveryDistance) {
        System.out.println("Задача 3");

        int dostavka = 0;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется " + (dostavka + 1) + " день");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется " + (dostavka + 2) + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется " + (dostavka + 3) + " дня");
        } else {
            System.out.println("Извините, но доставки у нас нет");
        }
        return dostavka;
    }
}

