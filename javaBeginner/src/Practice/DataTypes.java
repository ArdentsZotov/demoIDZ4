package Practice;
/*Задача №2 - Типы данных
Создание переменных:
Создайте переменную типа с плавающей точкой с наибольшим диапазоном чисел. Присвойте ей произвольное дробное значение.
Создайте переменную целочисленного типа с наименьшим диапазоном чисел. Присвойте  ей наибольшее возможное значение.
*/

public class DataTypes {
    public static void main(String[] args) {
        double Number1 = 3.14;
        byte Number2 = 127;
        System.out.println(Number1);
        System.out.println(Number2);

        //далее эксперименты
        //Переменная типа с плавающей точкой с наибольшим диапазоном чисел
        float A1 = 1.79f;
        int B1 = 10;
        int C1 = 308;
        double Y1 = Math.pow(B1,C1);
        double myFloat = A1 * Y1;
        System.out.println(myFloat);

        //Переменная целочисленного типа с наименьшим диапазоном чисел
        byte A2 = 1;
        byte B2 = 2;
        byte C2 = 7;
        double myNumber = Math.pow(B2,C2)-A2;
        System.out.printf("%3.0f%n",myNumber);
        float num = 1245584.23567f;
    }
}
