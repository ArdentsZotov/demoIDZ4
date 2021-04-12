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

//Вариант 1

package TaskHome;
import java.util.Scanner;
public class TaskHome17 {

    public static void main(String[] args) {
    /*
        int count = 0;// объявил счетчик и обнулил его

        Scanner in = new Scanner(System.in); // ввожу кол-во строк
        System.out.println("Введите количество строк: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) { // запускаю цикл очередности ввода строк
            System.out.println("Введите строку " + i + ": ");
            String phrases = in.next(); // ввожу строку*
            //in.next() вводит только одно слово до пробела
            //если поменять на in.nextLine(), чтобы вводить всю строку целиком,
            //то программа завершится после выбора кол-ва строк
            char array[] = phrases.toCharArray();// объявляю массив и добавляю в его элементы символы введенной строки
            for (int j = 0; j < array.length - 1; j++) {// пробегаю по элементам массива
                if (array[j] != array[j + 1] & array[array.length - 1] != array[j]) {
                    count++;// если левый элемент != правому, то счетчик +1 - уникальный символ
                }
            }
            int maxStr = 0; // из введенных строк нахожу строку с макс уникальных символов
            if (maxStr < count) {
                maxStr = count;
            }
            System.out.println(phrases); // выводим строку с макс длиной уникальных символов
        }
    */

//Вариант 2
        /*
        Scanner in = new Scanner(System.in); // ввожу кол-во строк
        System.out.println("Введите количество строк: ");
        int n = in.nextInt();
        String result = ""; // объявил пустую строку
        String phrases; // объявляю переменную для ввода строк
        for (int i = 1; i <= n; i++) { // запускаю цикл очередности ввода строк
            System.out.println("Введите строку " + i + ": ");
            phrases = in.next();
            //in.next() вводит только одно слово до пробела
            //если поменять на in.nextLine(), чтобы вводить всю строку целиком,
            //то программа завершится после выбора кол-ва строк
            char array[] = phrases.toCharArray();// объявляю массив и добавляю в его элементы символы введенной
            for (char character : phrases.toCharArray()) { // считает уникальные символы *
                if (!result.contains(String.valueOf(character))) result += character;
            }
        } System.out.print(result);
        // * имеется пустая строка result и входная строка из n символов input_str
        // по методу:
        // Для ВСЕХ СИМВОЛОВ character ИЗ МАССИВА str.toCharArray() ВЫПОЛНИТЬ {
        // ЕСЛИ (строка не содержит символ character)
        // ТО к result добавить символ character;
        // }
         */
    }
}
