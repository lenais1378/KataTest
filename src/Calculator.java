public class Calculator {
    public int getAnswer() {
        return answer;
    }
    private int answer = 0;
    public void calculate (int num1, int num2, String operator) {
        switch (operator) {
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
            case "/":
                answer = num1 / num2;
                break;
        }
    }
}
