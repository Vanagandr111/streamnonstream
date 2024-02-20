package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> filteredList = new ArrayList<>();

        // Отфильтровываем положительные числа и четные числа
        for (Integer number : intList) {
            if (number > 0 && number % 2 == 0) {
                filteredList.add(number);
            }
        }

        // Сортируем список
        filteredList.sort(Comparator.naturalOrder());

        // Выводим результат на экран
        for (Integer number : filteredList) {
            System.out.println(number);
        }
    }
}