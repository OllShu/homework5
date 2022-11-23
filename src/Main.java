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
        System.out.println("_________________________________________");

        // задание 5

        int monthNumber;
        monthNumber = 13;
        switch (monthNumber) {
                case 1 :
                    System.out.println("Месяц номер "+monthNumber+" - январь принадлежит сезону зима");
                    break;
                case 2 :
                    System.out.println("Месяц номер "+monthNumber+" - февраль принадлежит сезону зима");
                    break;
                case 3 :
                    System.out.println("Месяц номер "+monthNumber+" - март принадлежит сезону весна");
                    break;
                case 4 :
                    System.out.println("Месяц номер "+monthNumber+" - апрель принадлежит сезону весна");
                    break;
                case 5 :
                    System.out.println("Месяц номер "+monthNumber+" - май принадлежит сезону весна");
                    break;
                case 6 :
                    System.out.println("Месяц номер "+monthNumber+" - июнь принадлежит сезону лето");
                    break;
                case 7 :
                    System.out.println("Месяц номер "+monthNumber+" - июль принадлежит сезону лето");
                    break;
                case 8 :
                    System.out.println("Месяц номер "+monthNumber+" - август принадлежит сезону лето");
                    break;
                case 9 :
                    System.out.println("Месяц номер "+monthNumber+" - сентябрь принадлежит сезону осень");
                    break;
                case 10 :
                    System.out.println("Месяц номер "+monthNumber+" - октябрь принадлежит сезону осень");
                    break;
                case 11 :
                    System.out.println("Месяц номер "+monthNumber+" - ноябрь принадлежит сезону осень");
                    break;
                case 12 :
                    System.out.println("Месяц номер "+monthNumber+" - декабрь принадлежит сезону зима");
                    break;
            default:
                System.out.println("Такого месяца не существует");
        }


    }
}