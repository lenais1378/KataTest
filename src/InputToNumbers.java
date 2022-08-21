import java.util.*;

public class InputToNumbers {
private String input;


    private int num1;
    private int num2;
    private boolean isRomeNum;

    public InputToNumbers(String input) {
        this.input = input;
        String [] inputList = input.split(" ");

        Map<String,Integer> romeArabic = new HashMap<>();

        romeArabic.put("I",1);
        romeArabic.put("II",2);
        romeArabic.put("III",3);
        romeArabic.put("IV",4);
        romeArabic.put("V",5);
        romeArabic.put("VI",6);
        romeArabic.put("VII",7);
        romeArabic.put("VIII",8);
        romeArabic.put("IX",9);
        romeArabic.put("X",10);
        if (romeArabic.get(inputList[0]) != null && romeArabic.get(inputList[2]) != null) {
            num1 = romeArabic.get(inputList[0]);
            num2 = romeArabic.get(inputList[2]);
            isRomeNum = true;
        } else {
            num1 = Integer.parseInt(inputList[0]);
            num2 = Integer.parseInt(inputList[2]);
            isRomeNum = false;
        }
    }
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public boolean isRomeNum() {
        return isRomeNum;
    }
}
