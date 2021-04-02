package Practice;
//Задача №7_ Циклы
//Напишите программу:
// Пользователь вводит размер массива и данные с клавиатуры в массив
// Сравнить элементы массива с заранее заданными константами x, y, z.
// Если массив содержит хотя бы одну из констант,
// вывести текст "Данное значение имеется в константах".
/*
import java.util.Scanner;
public class Cycles {
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
*/

//Задача №8_ Циклы
//Напишите программу, где пользователь вводит любое целое положительное число n.
//А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
/*
import java.util.Scanner;
public class Cycles {
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
*/

//Задача №9_ Циклы
//Напишите программу:
//Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
//Посчитайте среднее арифметическое элементов массива.
//После этого произведите вывод массива на экран, где каждый элемент массива
//умножается на среднее арифметическое
/*
import java.util.Scanner;
public class Cycles {
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
*/
// Задача №10_Циклы
// Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
// а после этого произведите вывод первой строки матрицы на экран,
// где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
/*
import java.util.Arrays;
import java.util.Scanner;
public class Cycles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int lineSize = in.nextInt(); //ввод с клавиатуры размера матрицы
        int columnSize = in.nextInt();
        int myArray[][] = new int[lineSize][columnSize]; //объявление матрицы
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < lineSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                myArray[i][j] = in.nextInt();
            }
            System.out.println(Arrays.deepToString(myArray)); // вывод готовой матрицы
        }
            int firstLine;                                    // вывод первой строки матрицы и умножение каждого элемента на 3
            for (int j = 0; j < columnSize; j++) {
                firstLine = myArray[0][j] * 3;
               System.out.println(myArray[0][j] + " * " + 3 + " = " + firstLine);
        }
    }
}
*/

