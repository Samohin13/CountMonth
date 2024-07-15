package ru.netology.javaqa;

import ru.netology.javaqa.WorkRest.service.WorkRestService;


public class Main {
    public static void main(String[] args) {

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        WorkRestService service = new WorkRestService();
        service.calculate(income, expenses, threshold);
        System.out.println(service.calculate(income, expenses, threshold));


    }
}