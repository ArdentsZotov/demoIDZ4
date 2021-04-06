package TaskHome;
/*Задача №5_ Операторы
Напишите простой калькулятор:
Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
*/
import java.util.Scanner;
public class TaskHome5 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число x: ");
            int x = in.nextInt();
            System.out.println("Введите число y: ");
            int y = in.nextInt();
            System.out.println("Введите знак +, -, * или /: ");
            String Symbol = in.next();
            int z = 0;
            switch (Symbol) {
                case "+":
                    z = x + y;
                    break;
                case "-":
                    z = x - y;
                    break;
                case "*":
                    z = x * y;
                    break;
                case "/":
                    z = x / y;
                    break;
                default:
                    System.out.println("Некорректный символ. Введите символ: +, -, * или / ");
                    break;
            }
            System.out.println(x + Symbol + y + "=" + z);
        }
    }
