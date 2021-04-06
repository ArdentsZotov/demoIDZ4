package TaskHome;
/*
Итоговая задача №2 (Задача №16)
Напишите программу, которая позволит решить простое уравнение относительно x.
Программа принимает на вход строку длиной 5 символов.
Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
Первым, третьим и пятым символом являются две цифры (от 0 до 9)
и буква ‘x’ (обозначает неизвестное) в любом порядке.
Нужно найти неизвестное.
Пример для теста работы программы:
Ввод: x+5=7
Вывод: 2
Ввод: 3-x=9
Вывод: -6
Ввод: 3-3=x
Вывод: 0
*/
import java.util.Scanner;
public class TaskHome16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите линейное уровнение в формате a+b=с" +
                "\n" + "a,b,c - целые числа от 0 до 9" +
                "\nx - неизвестное." +
                "\nНапример: х+3=7");
        String eq = in.nextLine();
        System.out.println("Ввод: " + eq);
        // Проверяем длину вводимой строки:
        if (eq.length() <= 5 & eq.charAt(3) == '=') {
            char ch1 = eq.charAt(0);
            char ch2 = eq.charAt(1);
            char ch3 = eq.charAt(2);
            char ch4 = eq.charAt(3);
            char ch5 = eq.charAt(4);
            // Разрешаем ввод русской и латинский 'x' в условии:
            if (ch1 == 'x' | ch1 == 'х' & ch2 == '+'){
                int c5 = Character.getNumericValue(ch5);
                int c3 = Character.getNumericValue(ch3);
                int x = c5 - c3;
                System.out.println("Вывод: " + x);
            }
            else if (ch1 == 'x' | ch1 == 'х' & ch2 == '-') {
                int c5 = Character.getNumericValue(ch5);
                int c3 = Character.getNumericValue(ch3);
                int x = c5 + c3;
                System.out.println("Вывод: " + x);
            }
            else if (ch3 == 'x' | ch3 == 'х' & ch2 == '+'){
                int c5 = Character.getNumericValue(ch5);
                int c1 = Character.getNumericValue(ch1);
                int x = c5 - c1;
                System.out.println("Вывод: " + x);
            }
            else if (ch3 == 'x' | ch3 == 'х' & ch2 == '-'){
                int c5 = Character.getNumericValue(ch5);
                int c1 = Character.getNumericValue(ch1);
                int x = c1 - c5;
                System.out.println("Вывод: " + x);
            }
            else if (ch5 == 'x' | ch5 == 'х' & ch2 == '+'){
                int c3 = Character.getNumericValue(ch3);
                int c1 = Character.getNumericValue(ch1);
                int x = c3 + c1;
                System.out.println("Вывод: " + x);
            }
            else if (ch5 == 'x' | ch5 == 'х' & ch2 == '-') {
                int c1 = Character.getNumericValue(ch1);
                int c3 = Character.getNumericValue(ch3);
                int x = c1 - c3;
                System.out.println("Вывод: " + x);
            }
        } else {
            System.out.println("Ошибка");
        }
    }
}

