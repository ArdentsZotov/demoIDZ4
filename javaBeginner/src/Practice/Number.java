package Practice;
/*Задача №11_Работа с данными
Напишите программу:
Ввести первое число с клавиатуры и записать его в строковую переменную.
Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
Сравнить 2 числа и вывести большее на экран .
Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
*/
/*
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        String A = Integer.toString(in.nextInt()); //записываем первое число в строковую переменную
        System.out.println("Введите второе число");
        int B = in.nextInt(); // записываем второе число в целочисленную переменную
        System.out.println("Большее число = " + Math.max(Integer.parseInt(A),B)); // выбираем большее число
        System.out.println("Меньшее число = " + Math.min(Integer.parseInt(A),(double)B)); // выбираем меньшее число в типе double
    }
}
*/

/*
Задача №12_Работа с данными
Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
Проверить, содержит ли строка подстроку “Java” (используйте contains()).
Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring())
*/
/*
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {

        // Принимаем на вход строку:
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите в консоли:" + " I like Java!!!");
        String myStroke = in.nextLine();
        System.out.println("Вы ввели: " + "I like Java!!!");

        //Выполняем проверки через тернарный оператор:
        boolean caseOne = myStroke.contains("Java");
        String answer1 = (caseOne == true) ? "Да" : "Нет";
        System.out.println("Содержит ли строка подстроку “Java”? " + "\n - " + answer1);
        boolean caseTwo = myStroke.startsWith("I like");
        String answer2 = (caseTwo == true) ? "Да" : "Нет";
        System.out.println("Начинается ли строка с подстроки “I like”? " + "\n - " + answer2);
        boolean caseThree = myStroke.endsWith("!!!");
        String answer3 = (caseThree == true) ? "Да" : "Нет";
        System.out.println("Заканчивается ли строка с подставки “!!!”? " + "\n - " + answer3);

        // Преобразуем строку в верхний регистр:
        String Result1 = (caseOne == caseTwo == caseThree) ? myStroke.toUpperCase() : "Don't you like Java?";
        System.out.println(Result1);

        // Заменяем символы и выводим подстроку:
        String Result2 = myStroke.replace("a","o");
        System.out.println(Result2.substring(7,11));
    }
}
*/

/*
Задача №13_ Работа с данными
Напишите программу, где пользователь должен ввести строку из слов,
разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”.
Выполните следующие действия:
Выведите слова, состоящие только из латиницы.
Выведите количество этих слов
*/

/*
import java.util.Scanner;
public class Number {
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
*/

/*
Задача №14_ Работа с данными
Напишите программу, заполняющую массив из 15 элементов рандомными значениями
в диапазоне от -20 до 20.
Далее:
Выведите максимальный и минимальный элемент массива.
Из максимального и минимального значения выведите наибольшее по модулю.
*/
/*
import java.util.Random;
public class Number {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        // Объявляем объект random:
        Random random = new Random();
        // Перебираем элементы массива:
        for (int i = 0; i < myArray.length; i++) {
            // Указываем диапазон рандомных чисел для массива:
            myArray[i] = random.nextInt(41) - 20;
            System.out.print(myArray[i] + ";");
            }
        // Выводим максимальный и минимальный элемент массива
        int max = myArray[0];
        int min = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            max = Math.max(max, myArray[i]);
            min = Math.min(min, myArray[i]);
            }
        System.out.println("\nМаксимальный элемент массива = " + max);
        System.out.println("Минимальный элемент массива = " + min);
        // Выводим наибольшее по модулю:
        int maxModule = Math.max(Math.abs(max), Math.abs(min));
        System.out.println("Наибольшее по модулю число = " + maxModule);
    }
}
*/