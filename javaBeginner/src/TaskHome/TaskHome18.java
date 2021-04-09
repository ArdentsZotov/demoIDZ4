package TaskHome;
/*
Итоговая задача №4 (Задача №18)
Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает,
тот слезы проливает”. Ответ: “Заархивированный вирус”.
У пользователя есть 3 попытки, чтобы отгадать загадку.
Если пользователь ввел верный ответ, вывести:
“Правильно!” и завершить работу.
Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести
“Подумай еще!” и еще раз запросить ответ у пользователя.
Если пользователь сделал 3 неправильных попытки, вывести
“Обидно, приходи в другой раз” и завершить работу.
Также пользователь имеет право на подсказку при первой попытке,
при этом 2 и 3 попытки уже недоступны.
Если на первой попытке он введет строку “Подсказка”,
вывести любую подсказку. Если на 2 и 3, вывести “Подсказка уже недоступна”.
Если пользователь, использовавший подсказку, ошибется,
вывести “Обидно, приходи в другой раз” и завершить работу.
*/
import java.util.Scanner;
public class TaskHome18 {
    public static void main(String[] args) {
        System.out.println("Отгадайте загадку: \nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает" + "\nУ вас есть три попытки!");
        String correctAnswer = "Заархивированный вирус";
        Scanner in = new Scanner(System.in);
        // Первая попытка с подсказкой
        System.out.println("И так, первая попытка. Введите ответ:" +
                "\nНужна подсказка?" +
                "\n- Да" + "\n- Нет");
        String promptInput = in.nextLine();
        String promptYes = "Да";
        boolean prompt = promptYes.equalsIgnoreCase(promptInput);
        if (prompt == true) {
            System.out.println("Подсказка: " + "Его побеждает прививка от Сетевого Доктора!" +
                    "\nТеперь ваш ответ:");
            String firstAnswer = in.nextLine();
            boolean result1 = correctAnswer.equalsIgnoreCase(firstAnswer);
            if (result1 == true) {
                System.out.println("Правильно!");
            } else {
                System.out.println("Обидно, приходи в другой раз!:(");
            }
        } else if (prompt == false) {
            System.out.println("Ну, попробуй без подсказки отгадать!" +
                    "\nТвой ответ:");
            // Вторая попытка и подсказки боольше нет
            String firstAnswer = in.nextLine();
            boolean result1 = correctAnswer.equalsIgnoreCase(firstAnswer);
            if (result1 == true) {
                System.out.println("Правильно!");
            } else if (result1 == false) {
                System.out.println("Подумай еще!" +
                        "\nНужна подсказка?" + "\n- Да" + "\n- Нет");
                String prompt2Input = in.nextLine();
                String prompt2Yes = "Да";
                boolean prompt2 = promptYes.equalsIgnoreCase(prompt2Input);
                if (prompt2 == true) {
                    System.out.println("Подсказка больше недоступна!" +
                            "\nТвой ответ:");
                    String secondAnswer = in.nextLine();
                    boolean result2 = correctAnswer.equalsIgnoreCase(secondAnswer);
                    if (result2 == false) {
                        System.out.println("Нет! Ну же, соберись!" +
                                "\nНужна подсказка?" +
                                "\n- Да" + "\n- Нет");
                        String prompt3Input = in.nextLine();
                        String prompt3Yes = "Да";
                        boolean prompt3 = promptYes.equalsIgnoreCase(prompt3Input);
                        if (prompt3 == true) {
                            System.out.println("Да нет больше подсказок!" +
                                    "\nТретья и последняя попытка! И твой ответ?");
                            String thirdAnswer = in.nextLine();
                            boolean result3 = correctAnswer.equalsIgnoreCase(thirdAnswer);
                            if (result3 == false) {
                                System.out.println("Обидно, приходи в другой раз!:(");
                            } else {
                                System.out.println("Правильно!");
                            }
                        } else if (prompt3 == false) {
                            System.out.println("Третья и последняя попытка! И твой ответ?");
                            String thirdAnswer = in.nextLine();
                            boolean result3 = correctAnswer.equalsIgnoreCase(thirdAnswer);
                            if (result3 == true) {
                                System.out.println("Правильно!");
                            } else {
                                //System.out.println("Обидно, приходи в другой раз!:(");
                            }
                        }
                    } else {
                        System.out.println("Правильно!");
                    }

                } else if (prompt2 == false) {
                    System.out.println("Твой ответ:");
                }
                String secondAnswer = in.nextLine();
                boolean result2 = correctAnswer.equalsIgnoreCase(secondAnswer);
                if (result2 == false) {
                    System.out.println("Нет! Ну же, соберись!" +
                            "\nНужна подсказка?" +
                            "\n- Да" + "\n- Нет");
                    String prompt3Input = in.nextLine();
                    String prompt3Yes = "Да";
                    boolean prompt3 = promptYes.equalsIgnoreCase(prompt3Input);
                    if (prompt3 == true) {
                        System.out.println("Да нет больше подсказок!" +
                                "\nТретья и последняя попытка! И твой ответ?");
                        String thirdAnswer = in.nextLine();
                        boolean result3 = correctAnswer.equalsIgnoreCase(thirdAnswer);
                        if (result3 == true) {
                            System.out.println("Правильно!");
                        } else {
                            System.out.println("Обидно, приходи в другой раз!:(");
                        }
                    } else if (prompt3 == false) {
                        System.out.println("Третья и последняя попытка! И твой ответ?");
                        String thirdAnswer = in.nextLine();
                        boolean result3 = correctAnswer.equalsIgnoreCase(thirdAnswer);
                        if (result3 == true) {
                            System.out.println("Правильно!");
                        } else {
                            System.out.println("Обидно, приходи в другой раз:(");
                        }
                    }
                } else {
                    System.out.println("Правильно!");
                }
            }
        }
    }
}