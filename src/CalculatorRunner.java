import java.util.Scanner;
public class CalculatorRunner {
    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an expression with *, /, +, -, %, or ^: ");
        String expression = myScanner.nextLine();

        int index;
        String substring1;
        double num1 = 0;
        String substring2;
        double num2 = 0;
        boolean multiply = false;
        boolean division = false;
        boolean add = false;
        boolean subtract = false;
        boolean mod = false;
        boolean exponent = false;

        if (expression.contains("*")) {
            index = expression.indexOf("*");
            substring1 = expression.substring(0, index - 1);
            substring2 = expression.substring(index + 2);
            num1 = Double.parseDouble(substring1);
            num2 = Double.parseDouble(substring2);
            multiply = true;

        } else if (expression.contains("/")) {
            index = expression.indexOf("/");
            substring1 = expression.substring(0, index - 1);
            substring2 = expression.substring(index + 2);
            num1 = Double.parseDouble(substring1);
            num2 = Double.parseDouble(substring2);
            division = true;

        } else if (expression.contains("+")) {
            index = expression.indexOf("+");
            substring1 = expression.substring(0, index - 1);
            substring2 = expression.substring(index + 2);
            num1 = Double.parseDouble(substring1);
            num2 = Double.parseDouble(substring2);
            add = true;

        } else if (expression.contains("-")) {
            index = expression.indexOf("-");
            substring1 = expression.substring(0, index - 1);
            substring2 = expression.substring(index + 2);
            num1 = Double.parseDouble(substring1);
            num2 = Double.parseDouble(substring2);
            subtract = true;

        } else if (expression.contains("%")) {
            index = expression.indexOf("%");
            substring1 = expression.substring(0, index - 1);
            substring2 = expression.substring(index + 2);
            num1 = Double.parseDouble(substring1);
            num2 = Double.parseDouble(substring2);
            mod = true;

        } else if (expression.contains("^")) {
            index = expression.indexOf("^");
            substring1 = expression.substring(0, index - 1);
            substring2 = expression.substring(index + 2);
            num1 = Double.parseDouble(substring1);
            num2 = Double.parseDouble(substring2);
            exponent = true;
        }

        Calculator calc = new Calculator(num1, num2);
        double answer = 0;
        if (multiply) {
            answer = calc.multiply(num1, num2);
        } else if (division) {
            answer = calc.divide(num1, num2);
        } else if (add) {
            answer = calc.add(num1, num2);
        } else if (subtract) {
            answer = calc.subtract(num1, num2);
        } else if (mod) {
            answer = calc.mod(num1, num2);
        } else if (exponent) {
            answer = calc.pow(num1, num2);
        }

        System.out.println("The answer is: " + answer);
        myScanner.close();
    }
}
