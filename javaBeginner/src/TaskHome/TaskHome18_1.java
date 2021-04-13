
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class TaskHome18_1 {
    public static void main(String[] args) {
        System.out.println("Отгадайте загадку: \nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает" + "\nУ вас есть три попытки!");
        String correctAnswer = "Заархивированный вирус";
        Scanner in = new Scanner(System.in);
        int attempt = 1;
        boolean prompt = false;
        while (attempt <= 3) {
            System.out.println("Попытка " + attempt + ":");

            if (attempt == 1) {
                System.out.println("\nНужна подсказка?" +
                        "\n- Да" + "\n- Нет");
                String promptInput = in.nextLine();
                String promptYes = "Да";
                prompt = promptYes.equalsIgnoreCase(promptInput);
            }
            if (prompt) {
                System.out.println("Подсказка: " + "Его побеждает прививка от Сетевого Доктора!");
                attempt = 3;
                prompt = false;
            }
            System.out.println("Введите ответ:");
            String Answer = in.nextLine();
            boolean result = correctAnswer.equalsIgnoreCase(Answer);

            if (result) {
                System.out.println("Правильно!");
                break;
            } else {
                attempt++;
                System.out.println("Неправильно");
                if (attempt > 3) {
                    System.out.println("Обидно, приходи в другой раз!:(");
                    break;
                }
            }
        }
        System.out.println("Конец");
    }

}

