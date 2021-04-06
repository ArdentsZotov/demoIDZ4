package TaskHome;
/*
Задача №14_ Работа с данными
Напишите программу, заполняющую массив из 15 элементов рандомными значениями
в диапазоне от -20 до 20.
Далее:
Выведите максимальный и минимальный элемент массива.
Из максимального и минимального значения выведите наибольшее по модулю.
*/
import java.util.Random;
public class TaskHome14 {
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
