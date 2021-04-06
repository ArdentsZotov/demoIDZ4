package TaskHome;
/*Задача №1 - Первая программа
Вывести на консоль текст “Hello World!”:
Скачать и установить IntelliJ IDEA.
Написать первую программу, которая выводит в консоль строку “Hello World!”.
Подключиться к GitHub, залить программу в созданный репозиторий.*/

public class TaskHome1 {
    public static void main(String[] args) {
        //Простой вариант
        System.out.println("Hello World!");
        //Далее играл с разными вариантами
        char a = '\"';
        String b = "Hello World!";
        System.out.println(a + b + a);
        System.out.println("\"Hello World!\"");
        System.out.printf("%s%s%s", "\"", "Hello World!", "\"");
    }
}
