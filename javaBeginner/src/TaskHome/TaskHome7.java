package TaskHome;
/*Задача №7_ Циклы
Напишите программу:
Пользователь вводит размер массива и данные с клавиатуры в массив
Сравнить элементы массива с заранее заданными константами x, y, z.
Если массив содержит хотя бы одну из констант,
вывести текст "Данное значение имеется в константах".
*/
import java.util.Scanner;
public class TaskHome7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arraySize = in.nextInt();//ввод с клавиатуры
        int myArray[] = new int[arraySize];//объявление массива
        System.out.println("Размер массива:" + arraySize);//вывод размера массива на экран

        System.out.println("Ввести элементы массива:");//заполняем массив с клавиатуры
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = in.nextInt();
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.print(myArray[i] + " ");//выводим в консоль запиленный массив
        }
        int x = 2;
        int y = 4;
        int z = 6;//вводим константы

        for (int i = 0; i < myArray.length; i++) { // сравниваем константы с данными массива
            if (i == x || i == y || i == z) {
                System.out.println("\nДанное значение " + i + " имеется в константах");
            }
        }
    }
}

