public class Main {
    public static void main(String[] args) {
        int clientOS;
        int clientDeviceYear;
        clientOS = 1;
        clientDeviceYear = 2014;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println("_________________________________________");

        // задание 3

        int year;
        year = 2022;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("_________________________________________");

        // задание 4

        int deliveryDistance;
        int deliveryDay;
        deliveryDistance = 100;

        if (deliveryDistance < 20) {
            deliveryDay = 1;
        } else if ((deliveryDistance - 20) % 40 == 0) {
            deliveryDay = 1 + (deliveryDistance - 20) / 40;
        } else {
            deliveryDay = 2 + (deliveryDistance - 20) / 40;
        }

        System.out.println("Доставка займет дней всего: " + deliveryDay);

    }
}