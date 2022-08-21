import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добрый день!\n" +
                "В калькуляторе можно складывать, вычитать, делить и умножать числа от 0 до 10\n" +
                "Можно использовать только либо арабские либо римские числа\n" +
                "Калькулятор поддерживает только выражения, соответствующие шаблону: \n" +
                "[число][пробел][знак +-*/][пробел][число]\n" +
                "Пример: 2 + 7 или IX + V\n" +
                "Для остановки работы калькулятора введите любое несоответствующее шаблону выражение или слово");

        do {
            System.out.println("Введите выражение:");
            Scanner scanner = new Scanner(System.in);
            String inputString = scanner.nextLine();

            InputCheck correctInputString = new InputCheck();
            correctInputString.checkInput(inputString);

            if (correctInputString.getIsInputCorrect()) {

                String operator = inputString.split(" ")[1];

                InputToNumbers dictionary = new InputToNumbers(inputString);

                Calculator calculator = new Calculator();
                calculator.calculate(dictionary.getNum1(), dictionary.getNum2(), operator);

                if (dictionary.isRomeNum()) {
                    ArabicToRome arabicToRome = new ArabicToRome(calculator.getAnswer());
                    System.out.println("Ваш ответ: " + arabicToRome.getResultInRome());
                    System.out.println("________");

                } else {
                    System.out.println("Ваш ответ: " + calculator.getAnswer());
                    System.out.println("________");
                }
            } else {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Исключение: выражение не соответствует шаблону");
                    break;
                }
            }

        } while (true);
        System.out.println("Окончание работы калькулятора...");
    }
}
