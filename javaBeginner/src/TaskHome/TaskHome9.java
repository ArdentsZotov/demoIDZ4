package TaskHome;
/*
Задача №9_ Циклы
Напишите программу:
Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
Посчитайте среднее арифметическое элементов массива.
После этого произведите вывод массива на экран, где каждый элемент массива
умножается на среднее арифметическое
*/
import java.util.Scanner;
public class TaskHome9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arraySize = in.nextInt(); //ввод с клавиатуры
        double myArray[] = new double[arraySize]; //объявление массива
        System.out.println("Размер массива:" + arraySize); //вывод размера массива на экран

        System.out.println("Ввести элементы массива:"); //заполняем массив с клавиатуры
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = in.nextDouble();
        }
        double sum = 0; //используем foreach
        for (double i : myArray) {
            sum += i;
        }
        double average = sum / myArray.length; // вычисляем среднее арифметическое элементов массива

        System.out.println("Среднее арифметическое элементов массива = " + average);

        for (int i = 0; i < arraySize; i++) {
            System.out.println(myArray[i] + " * " + average + " = " + myArray[i] * average); //умножаем среднее арифметическое элементов массива на элементы массива
        }
    }
}
