package TaskHome;
/*
Задача №13_ Работа с данными
Напишите программу, где пользователь должен ввести строку из слов,
разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”.
Выполните следующие действия:
Выведите слова, состоящие только из латиницы.
Выведите количество этих слов
*/

import java.util.Scanner;
public class TaskHome13 {
    public static void main(String[] args) {

        // Принимаем на вход строку:
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите в консоли фразу на английском и её перевод");
        String myStroke = in.nextLine();
        String engStroke = new String();

        // Способ 1. Выводим латинские слова с помощью массива
        // Объявляем массив:
        char myChar [];

        //записывает в массив знаки unicode из введенной строки:
        myChar = myStroke.toCharArray();

        // Перебираем элементы массива:
        for (int i = 0; i < myChar.length; i++) {
            if (myChar[i] < 254) engStroke += myChar[i];
        }

        // Выводим слова, состоящие только из латиницы:
            System.out.println(engStroke);

        // Способ 2. Выводим латинские слова с помощью replaceAll
        // Уберем кириллицу из фразы:
            engStroke = myStroke.replaceAll("[а-яА-Я\\d]", "");

        // Выводим слова, состоящие только из латиницы:
            System.out.println(engStroke);

        // Считаем количество слов в строке:
        String quantityWords [] = engStroke.split("  ");
        System.out.println("Количество слов в строке: " + quantityWords.length);
        }
    }
