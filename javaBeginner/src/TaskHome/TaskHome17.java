package TaskHome;
/*
Итоговая задача №3 (Задание №17)
Напишите программу, где пользователь вводит сначала количество строк n,
затем сами строки. Среди данных строк найти строку с максимальным количеством
различных символов. Если таких строк будет много, то вывести первую.
Пример для теста работы программы:
Количество строк: 3
Строка 1: привет
Строка 2: анализ
Строка 3: 111111111111
Ответ: привет
*/

import java.awt.*;
import java.util.Scanner;
public class TaskHome17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = in.nextInt();
        String phrases[] = new String[n];
        System.out.println("Количество строк: " + n);
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку " + (i + 1) + ": ");
            phrases[i] = in.next();
        }
        for (int i = 0; i < phrases.length; i++) {
            for (int j = 0; j < phrases.length; j++) {
                if (phrases[i].length() > phrases[j].length()) {
                    System.out.println(phrases[i]);
                }
        }

            }
        }
    }

