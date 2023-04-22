package ru.netology.services;

public class CalculateClass {
    public int calculate(int income, int expense, int threshold) {
        int capital = 0;
        int count;
        int monthOfRest = 0;
        for (count = 1; count <= 12; count++) {
            if (capital >= threshold) {
                monthOfRest++;
                capital = (capital - expense) / 3;
            } else {
                capital = capital + income - expense;
            }
        }
        return monthOfRest;
    }
}
