package TaskHome;
/*
Задача №10_Циклы
Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
*/
import java.util.Arrays;
import java.util.Scanner;
public class TaskHome10 {
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
