package TaskHome;

import java.util.Scanner;
public class TaskHome18_1 {
    public static void main(String[] args) {
        System.out.println("Отгадайте загадку: \nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает" + "\nУ вас есть три попытки!");
        String correctAnswer = "Заархивированный вирус";
        Scanner in = new Scanner(System.in);
        int attempt = 1;
        while (attempt <= 3) {
            if (attempt < attempt + 1) {
                System.out.println("Попытка " + attempt + ":");
               // if (attempt == 1) { } // подсказка только на 1 шаге

                System.out.println("\nНужна подсказка?" +
                            "\n- Да" + "\n- Нет");
                    String promptInput = in.nextLine();
                    String promptYes = "Да";
                    boolean prompt = promptYes.equalsIgnoreCase(promptInput);
                    if (prompt == true) {
                        System.out.println("Подсказка: " + "Его побеждает прививка от Сетевого Доктора!" +
                                "\nВведите ответ:");
                        String Answer = in.nextLine();
                        boolean result = correctAnswer.equalsIgnoreCase(Answer);

                        if (result == true) {
                            System.out.println("Правильно!");
                        } else {
                            System.out.println("Обидно, приходи в другой раз!:(");
                        }
                        break;
                    } else {
                        System.out.println("Первая попытка \nВведите ответ:");
                        String Answer = in.nextLine();
                        boolean result = correctAnswer.equalsIgnoreCase(Answer);
                        if (result == true) {
                            System.out.println("Правильно!");
                            break;
                        } else {
                            System.out.println("Не правильно!");
                        }
                    }
              //  }
                attempt++;
            }
        } System.out.println("Конец");
    }
}
