package Practice;
/*Выполните следующие действия с массивом:
Задайте массив из 5 любых целых чисел.
Поменяйте местами первый и последний элемент в массиве.
Вывести в консоль результат суммы первого и среднего элемента.
Примечание : Для получения последнего и среднего элементов в массиве используйте свойство length.
*/

public class myArrays {
    public static void main(String[] args) {
        int myArr[] = {10,2,17,8,5};
        int myArr1 = myArr[0];
        myArr[0] = myArr[myArr.length - 1];
        myArr[4] = myArr1;
        int Sum = myArr[myArr.length - 5] + myArr[myArr.length -3];
        for (int i = 0; i < myArr.length; i++){
            System.out.print(myArr[i] + " ");
        }
        System.out.println("\nСумма первого и среднего элемента = " + Sum);
    }
}
