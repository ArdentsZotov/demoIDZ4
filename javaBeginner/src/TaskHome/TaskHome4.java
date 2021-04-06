package TaskHome;
/*Задача №4_Операторы
Написать программу, которая будет выполнять следующие действия:
Ввести три числа с клавиатуры x, y, z
Найти и вывести в консоль среднее арифметическое этих чисел.
Разделить среднее арифметическое на 2 и округлить в меньшую сторону
Если полученное число больше 3, то вывести на экран сообщение
"Программа выполнена корректно"
*/
import java.util.Scanner;
public class TaskHome4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите по очереди числа любые три целых числа: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double sum = x + y + z;
        System.out.printf("Среднее арифметическое = %.1f%n", sum / 3);
        double quotient = (sum / 3) / 2;
        System.out.println("Делим на 2 среднее арифметическое и округляем в меньшую сторону = " + Math.floor(quotient));
        String answer = (Math.floor(quotient) > 3) ? "Программа выполнена корректно" : "Начнем сначала";
        System.out.println(answer);
    }
}
