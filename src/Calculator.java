import java.io.*;

public class Calculator {

    public int amountOfNumbers (int a, int b) {
        return a + b;
    }

    public int subtractionOfNumbers (int a, int b) {
        return a - b;
    }

    public int multiplicationOfNumbers (int a, int b) {
        return a * b;
    }

    public int divisionOfNumbers (int a, int b) {
        return a / b;
    }

    public int enteringNumbers (int one, int two, String operation) {
        int result = 0;
        switch(operation) {
            case "+":
                result = amountOfNumbers(one, two);
                break;
            case "-":
                result = subtractionOfNumbers(one, two);
                break;
            case "*":
                result = multiplicationOfNumbers(one, two);
                break;
            case "/":
                result = divisionOfNumbers(one, two);
                break;
            default:
                System.out.println("Вы ввели неизвестную операцию");
        }
        return result;
    }
}
