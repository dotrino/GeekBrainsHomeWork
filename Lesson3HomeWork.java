import java.util.Random;
import java.util.Scanner;

public class Lesson3HomeWork {

    private static Random random = new Random();

    public static void main(String[] args) {
        // 1 задание
         guessNumber();
        // 2 задание
        //  guessFruit();

    }



    private static void guessNumber() {

        Scanner scanner = new Scanner(System.in);
        do {
            int numComp = random.nextInt(10);
            System.out.println("Угадайте число с 3 попыток от 0 до 9");
            for (int i = 3; i > 0; i--) {
                System.out.println("Введи свой ответ:");
                int questionNum = scanner.nextInt();
                if (questionNum == numComp) {
                    System.out.println("Вы угадали число, молодец!");
                    break;
                }
                System.out.println(questionNum > numComp ? "Введенное число больше " : "Введенное число меньше ");
                System.out.println((i - 1) > 0 ? " у вас осталось " + (i - 1) + " попыток." : "Попытки закончились, вы проиграли.");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        }
        while (scanner.nextInt() == 1);
    }


     static void guessFruit() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int indWord = random.nextInt(words.length - 1);
        String word = words[indWord];
        int lenWord = word.length();
        System.out.println("Я загадал слово, попробуй отгадать его");
        System.out.println(word);

        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Введи свой ответ:");
            String answer = scanner.nextLine();

            if (answer.equals("")) break;
            else if (word.equals(answer)) {
                System.out.println("Вы угадали слово, игра закончена!!!");
                break;
            }

            char[] charsAnswer = answer.toCharArray();
            for (int i = 0; i < lenWord; i++) {
                if (i >= charsAnswer.length) break;
                if (word.charAt(i) != charsAnswer[i]) charsAnswer[i] = '#';
            }
            StringBuilder comment = new StringBuilder(String.valueOf(charsAnswer));
            for (int i = comment.length(); i < 15; i++) comment.append("#");
            System.out.println(comment);
        }
        while (true);
    }
}

