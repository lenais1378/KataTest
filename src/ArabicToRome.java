import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ArabicToRome {

    private String resultInRome = "";

    public ArabicToRome(int inputNum) {
        int numRomeC;
        int numRomeL;
        int numRomeX;

        if (inputNum >= 1) {
            numRomeC = inputNum / 100;
            inputNum = inputNum % 100;
            for (int i = 0; i < numRomeC; i++) {
                resultInRome += "C";
            }

            numRomeL = inputNum / 50;
            inputNum = inputNum % 50;
            for (int i = 0; i < numRomeL; i++) {
                resultInRome += "L";
            }

            numRomeX = inputNum / 10;
            inputNum = inputNum % 10;
            for (int i = 0; i < numRomeX; i++) {
                resultInRome += "X";
            }


    Map<Integer,String> arabicRome = new HashMap<>();

        arabicRome.put(1,"I");
        arabicRome.put(2,"II");
        arabicRome.put(3,"III");
        arabicRome.put(4,"IV");
        arabicRome.put(5,"V");
        arabicRome.put(6,"VI");
        arabicRome.put(7,"VII");
        arabicRome.put(8,"VIII");
        arabicRome.put(9,"IX");

        String divisionRemainder = arabicRome.get(inputNum);
            if (divisionRemainder != null) {
                resultInRome += divisionRemainder;
            }

        } else {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Исключение: ответ в римских числах не может быть меньше единицы");
                resultInRome = "нет ответа";
            }
        }
    }
    public String getResultInRome() {
        return resultInRome;
    }
}
