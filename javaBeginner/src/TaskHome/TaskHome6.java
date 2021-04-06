package TaskHome;
/*Задача №6_ Операторы
Напишите программу конвертер физических величин:
1. Пользователю предлагается на выбор ввести массу или расстояние.
Пример:
Выберите что переводить: 1 - масса, 2 - расстояние
2. Пользователю предлагается выбрать единицу измерения.
Пример:
Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
3. Пользователю предлагается ввести количество выбранных единиц:
Введите число
10
Результат:
Метры: 10
Мили: 0.006
Ярды: 10.94
Футы: 32.81
 */
import java.util.Scanner;
public class TaskHome6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите: \n 1 - Масса \n 2 - Расстояние");
        int type = in.nextInt();
        if (type == 1) {
            System.out.println("Вы выбрали: Масса");
            System.out.println("Выберите: \n 1 - Килограмм \n 2 - Грамм \n 3 - Фунт \n 4 - Унция");
            int unitWeight = in.nextInt();
            if (unitWeight == 1) {
                System.out.println("Вы выбрали: Килограмм");
                if (unitWeight == 2) {
                    System.out.println("Вы выбрали: Грамм");
                    if (unitWeight == 3) {
                        System.out.println("Вы выбрали: Фунт");
                        if (unitWeight == 4) {
                            System.out.println("Вы выбрали: Унция");
                        } else {
                            System.out.println("Ошибка: выбрана некорректная единица массы");
                        }
                    }
                }
            }
            System.out.println("Введите число:");
            double numberWeight = in.nextDouble();
            switch (unitWeight) {
                case 1:
                    System.out.println("Килограмм: " + numberWeight);
                    System.out.printf("Грамм: %.3f%n", numberWeight * 1000);
                    System.out.printf("Фунт: %.3f%n", numberWeight * 2.205);
                    System.out.printf("Унция: %.3f%n", numberWeight * 35.274);
                    break;
                case 2:
                    System.out.println("Грамм: " + numberWeight);
                    System.out.printf("Килограмм: %.3f%n", numberWeight / 1000);
                    System.out.printf("Фунт: %.3f%n", numberWeight / 454);
                    System.out.printf("Унция: %.3f%n", numberWeight / 28.35);
                    break;
                case 3:
                    System.out.println("Фунт: " + numberWeight);
                    System.out.printf("Грамм: %.3f%n", numberWeight * 454);
                    System.out.printf("Килограмм: %.3f%n", numberWeight / 2.205);
                    System.out.printf("Унция: %.3f%n", numberWeight * 16);
                    break;
                case 4:
                    System.out.println("Унция: " + numberWeight);
                    System.out.printf("Фунт: %.3f%n", numberWeight / 16);
                    System.out.printf("Грамм: %.3f%n", numberWeight * 28.35);
                    System.out.printf("Килограмм: %.3f%n", numberWeight / 35.274);
                    break;
                default:
                    System.out.println("Ошибка: я умею конвертировать массу только в граммы, килограммы, фунты и унции");
                    break;
            }
        }
        if (type == 2) {
            System.out.println("Вы выбрали: Расстояние");
            System.out.println("Выберите: \n 1 - Метр \n 2 - Миля \n 3 - Ярд \n 4 - Фут");
            int unitDistance = in.nextInt();
            if (unitDistance == 1) {
                System.out.println("Вы выбрали:  Метр");
                if (unitDistance == 2) {
                    System.out.println("Вы выбрали: Миля");
                    if (unitDistance == 3) {
                        System.out.println("Вы выбрали: Ярд");
                        if (unitDistance == 4) {
                            System.out.println("Вы выбрали: Фут");
                        } else {
                            System.out.println("Ошибка: выбрана некорректная единица расстояния");
                        }
                    }
                }
            }
            System.out.println("Введите число:");
            double numberDistance = in.nextDouble();
            switch (unitDistance) {
                case 1:
                    System.out.println("Метры: " + numberDistance);
                    System.out.printf("Мили: %.3f%n", numberDistance / 1609);
                    System.out.printf("Ярды: %.3f%n", numberDistance * 1.094);
                    System.out.printf("Футы: %.3f%n", numberDistance * 3.281);
                    break;
                case 2:
                    System.out.println("Мили: " + numberDistance);
                    System.out.printf("Метры: %.3f%n", numberDistance * 1609);
                    System.out.printf("Ярды: %.3f%n", numberDistance * 1760);
                    System.out.printf("Футы: %.3f%n", numberDistance * 5280);
                    break;
                case 3:
                    System.out.println("Ярды: " + numberDistance);
                    System.out.printf("Метры: %.3f%n", numberDistance / 1.094);
                    System.out.printf("Мили: %.3f%n", numberDistance / 1760);
                    System.out.printf("Футы: %.3f%n", numberDistance * 3);
                    break;
                case 4:
                    System.out.println("Футы: " + numberDistance);
                    System.out.printf("Метры: %.3f%n", numberDistance / 3.281);
                    System.out.printf("Мили: %.3f%n", numberDistance / 5280);
                    System.out.printf("Ярды: %.3f%n", numberDistance / 3);
                    break;
                default:
                    System.out.println("Ошибка: я умею конвертировать расстояния только в метрах, милях, ярдах и футах");
                    break;
            }
        }
    }
}


