package TaskHome;
/*
Задача №11_Работа с данными
Напишите программу:
Ввести первое число с клавиатуры и записать его в строковую переменную.
Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
Сравнить 2 числа и вывести большее на экран .
Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
*/
import java.util.Scanner;
public class TaskHome11 {
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
