package com.company;

public class Main {

    public static void main(String[] args) {
        // задание 1
        int clientOS = 1;
        if (clientOS >= 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else
            System.out.println("Установите версию приложения для iOS по ссылке ");
        // задание 2
        int clientDeviceYear = 2015;
        int clientOSS = 0;
        if (clientOSS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android  по ссылке");
               if (clientOSS == 1 && clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOSS == 0 && clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else System.out.println("Установите версию приложения для iOS по ссылке");
        //задание 3
        int year = 2021;
        if(year%4==0 && year%100 !=0 || year%400==0){
            System.out.println("  год является високосным");
        } else System.out.println("  год не является високосным");
        // задание 4
        int  deliveryDistance = 95;
        if (deliveryDistance <= 19) {
            System.out.println("Потребуется дней: 1 день + срок доставки");
        } if (deliveryDistance >=20 && deliveryDistance <= 60){
                System.out.println("Потребуется дней:2 дня + срок доставки");
            } if (deliveryDistance >= 60 && deliveryDistance <= 100)
                System.out.println("Потребуется дней: 3 дня + срок доставки");
        //задание 5
        int monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }

    }
}
