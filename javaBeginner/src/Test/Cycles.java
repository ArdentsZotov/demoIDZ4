package Test;
//1. Какой максимальный элемент в массиве?
/*
public class Cycles {
    public static void main(String[] args) {
        double[] myArray = {11, 5.8, 11.1, 10, 9};
        double max = Double.MIN_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            max = Math.max(max,myArray[i]);
        }
        System.out.println("Максимальный элемент в массиве myArray: " + max);
    }
}
*/
//2. Какова сумма чисел массива по коду?
/*
public class Cycles {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Сумма чисел массива: " + total);
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Наибольший элемент: " + max);
    }
}
*/
//3. Какой результат выполнения программы будет на экране, опираясь на скрипт ниже?
/*
public class Cycles {
    public static void main(String[] args) {
        for (int x = 10; x < 15; x = x + 1) {
            System.out.print("Значение x: " + x);
            System.out.print("\n");
        }
    }
}
*/
//4. Что будет результатом выполнения следующего цикла:
/*
public class Cycles {
    public static void main(String[] args) {
        int x = 9;
        do {
            System.out.print("Значение x: " + x);
            System.out.print("\n");
            x++;
        } while (x < 14);
    }
}
*/
//5. Чему будет равен x и y в после выполнения программы?
/*
public class Cycles {
    public static void main(String[] args) {
        int x = 5;
        int y = 60;
        for (; x < y; x += 10, y--);
        System.out.println("x равен " + x + " ; y равен " + y);
    }
}
*/
//6. Какие числа будут выведены в консоль в результате выполнения программы?
/*
public class Cycles {
    public static void main(String[] args) {
        int[] array2 = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < array2.length; i++){
            if (!(array2[i] % 2 == 0))
            {
                System.out.println(i);
            }
        }
    }
}
*/
//7. Укажите правильные утверждения про цикл for
/*
public class Cycles {
    public static void main(String[] args) {
// Цикл for может быть следующего вида -
        for (double i = 0; i < 5; i++);
// Цикл for может не иметь параметров, т.е. выглядеть так:
        for(;;);
// Конструкция цикла for выглядит следующим образом: for(шаг; условие; инициализация)
//
    }
}
*/
//8. Что будет в результате выполнения следующего цикла?
/*
public class Cycles {
    public static void main(String[] args) {
        for (int i = 1; i < 3; i++) {
            switch (i) {
                default:
                    System.out.printf("i = %d \n", i++);
                    break;
            }
        }
    }
}
*/
//9. Какой будет наибольший элемент массива?
/*
public class Cycles {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Сумма чисел массива: " + total);
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Наибольший элемент: " + max);
    }
}
*/
//10. Какое число будет выведено в консоль в результате выполнения программы?
/*
public class Cycles {
    public static void main(String[] args) {
        int[] nums = new int[1];
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
*/
//11. Укажите корректное соответствие
// Break - завершает работу цикла или оператора switch, и передаёт выполнение следующему
// который находится сразу же после цикла или оператора switch
// Continue - заставляет цикл пропустить оставшуюся часть его тела и сразу перепроверить
// вновь его состояние сначала

//12. Установите правильное соответствие
// Выполняет последовательность операторов несколько раз и сокращает код,
// которым управляет переменная цикла - For
// Выполняется цикл while, за исключением того, что он проверяет условия
// в конце тела цикла - Do...while
// Повторяет оператор или группу операторов, пока заданное условие является true.
// Цикл проверяет условие до выполнения тела цикла - While

//13. Какие числа будут выведены в консоль в результате выполнения программы?
/*
public class Cycles {
    public static void main(String[] args) {
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array3.length; i++) {
            if(!(array3[i] % 2 == 0)) {
                System.out.println(array3[i]);
            }
        }
    }
}
*/
//14. Сколько чисел будет на выходе работы данной программы - улучшенный цикл for (foreach):
/*
public class Cycles {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.print(x);
            System.out.println("\n");
        }
    }
}
*/
//15. Что будет результатом выполнения следующего цикла:
/*
public class Cycles {
    public static void main(String[] args) {
        for (int i = 0, int j = 5;i < 5; i++, j--) { //ошибка компиляции
            System.out.println("i = " + i + " j = " + j);
        }
*/
//Код не скопмилируется, так как в for нельзя объявить две переменные.
// Можно исправить код:
        public class Cycles {
            public static void main(String[] args) {
                int j = 5;
                for (int i = 0; i < 5; i++, j--) { //ошибка компиляции
                    System.out.println("i = " + i + " j = " + j);
                }
    }
}