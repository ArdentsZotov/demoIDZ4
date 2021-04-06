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
        if (eq.length() <= 5 && eq.charAt(3) == '=') {
            char ch1 = eq.charAt(0);
            char ch2 = eq.charAt(1);
            char ch3 = eq.charAt(2);
            char ch5 = eq.charAt(4);

            if (ch1 == 'x' | ch1 == 'х'){ // Разрешаем ввод русской и латинский 'x' в условии:
                int c5 = Character.getNumericValue(ch5);
                int c3 = Character.getNumericValue(ch3);
                if (ch2 == '+') { // Проверяем + или -
                    int r1 = c5 - c3;
                    System.out.println("Вывод: " + r1);
                }
                else
                if (ch2 == '-') {
                    int r2 = c5 + c3;
                    System.out.println("Вывод: " + r2);
                }
            }
            if (ch3 == 'x' | ch3 == 'х') {
                int c5 = Character.getNumericValue(ch5);
                int c1 = Character.getNumericValue(ch1);
                if (ch2 == '+') {
                    int r3 = c5 - c1;
                    System.out.println("Вывод: " + r3);
                } else if (ch2 == '-') {
                    int r4 = c1 - c5;
                    System.out.println("Вывод: " + r4);
                }
            }
            if (ch5 == 'x' | ch5 == 'х') {
                int c3 = Character.getNumericValue(ch3);
                int c1 = Character.getNumericValue(ch1);
                if (ch2 == '+') {
                    int r5 = c3 + c1;
                    System.out.println("Вывод: " + r5);
                } else if (ch2 == '-') {
                    int r6 = c1 - c3;
                    System.out.println("Вывод: " + r6);
                }
            }
        } else {
            System.out.println("Ошибка");
        }
    }
}

