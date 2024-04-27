package ru.netology.services;

public class RestService {
    public int calculateRest(int income, int expenses, int threshold) {
        int money = 0;
        int month = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money -= expenses;
                money = money / 3;
                month++;

            } else {
                money += income;
                money -= expenses;
            }
        }
        return month;

    }






}
