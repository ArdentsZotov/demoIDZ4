package TaskHome;
/*
Задача №8_ Циклы
Напишите программу, где пользователь вводит любое целое положительное число n.
А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
*/
import java.util.Scanner;
public class TaskHome8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = in.nextInt();
        if (n > 0) {
            System.out.println("Вы ввели число " + n);
            int sum = 0;
            for (int i = 1; i < n; i++){
                if (!(i % 2 == 0))
                    sum += i;
            }
            System.out.println(sum);
        } else {
            if (n == 0) {
                System.out.println(n + " - это целое число, но оно не является ни положительным ни отрицательным");
                System.out.println("Введите любое положительное число, отличное от 0");
            } else {
                System.out.println("Введите любое ЦЕЛОЕ ПОЛОЖИТЕЛЬНОЕ число");
            }
        }
    }
}

