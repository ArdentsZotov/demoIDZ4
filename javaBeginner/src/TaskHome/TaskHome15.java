package TaskHome;
/*
Итоговая задача №1 (Задание №15)
Напишите программу конвертер валют.
Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.
Итоговое значение должно быть округлено до двух знаков после запятой.
Пример для теста работы программы:
Курс доллара: 67,55
Количество рублей: 1000
Итого: 14,80 долларов
*/
import java.util.Scanner;
public class TaskHome15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите курс доллара: ");
        Double dollarRate = in.nextDouble();
        System.out.println("Введите количество рублей: ");
        Double rubRate = in. nextDouble();
        System.out.println("Курс доллара: " + dollarRate + "р.");
        System.out.println("Количество рублей: " + rubRate + "р.");
        double result = rubRate / dollarRate;
        System.out.printf("%s %.2f%s", "Итого:",result,"$");
    }
}

