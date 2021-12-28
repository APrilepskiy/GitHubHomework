import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int one = 0, two = 0, result = 0, counter = 0;
        String operation = "";

        System.out.println();
        System.out.println("Добро пожаловать в программу калькулятор!");
        System.out.println();

        System.out.println("Для начала работы введите первое число и нажмите клавишу 'Enter' " +
                "затем  операцию (+, -, / или *) и нажмите клавишу 'Enter' " +
                "в конце введите последнюю цифру и нажмите клавишу 'Enter'.\n" +
                "Для выхода их программы напишите 'stop'. " +
                "Для сброса ввода нажмите клавишу 'c' (на английском) и ввод начнется заново.\n" +
                "ВНИМАНИЕ!!!\n" +
                "Если после получения первого результата вы не нажали на кнопку сброса, то " +
                "результат сохранен и первый операнд вводить не нужно,\n" +
                "необходимо ввести сразу операцию, а затем второй операнд.");

        while(true) {

            if(counter == 0) {
                String strLineOne = reader.readLine();
                if(strLineOne.equals("stop")) {
                    System.out.println("Вы ввели команду завершения работы.");
                    break;
                }
                else if(strLineOne.equals("c")) {
                    System.out.println("Вы ввели команду сброса. Начните ввод заново.");
                    continue;
                }
                one = Integer.parseInt(strLineOne);

                String strLineOp = reader.readLine();
                if(strLineOp.equals("stop")) {
                    System.out.println("Вы ввели команду завершения работы.");
                    break;
                }
                else if(strLineOp.equals("c")) {
                    System.out.println("Вы ввели команду сброса. Начните ввод заново.");
                    continue;
                }
                operation = strLineOp;

                String strLineTwo = reader.readLine();
                if(strLineTwo.equals("stop")) {
                    System.out.println("Вы ввели команду завершения работы.");
                    break;
                } else if (strLineTwo.equals("c")) {
                    System.out.println("Вы ввели команду сброса. Начните ввод заново.");
                    continue;
                }
                two = Integer.parseInt(strLineTwo);

                counter++;
                Calculator calc = new Calculator();
                result = calc.enteringNumbers(one, two, operation);
                System.out.println("Ваш результат = " + result);
                one = result;
            }

            String strLineOp = reader.readLine();
            if(strLineOp.equals("stop")) {
                System.out.println("Вы ввели команду завершения работы.");
                break;
            }
            else if(strLineOp.equals("c")) {
                System.out.println("Вы ввели команду сброса. Начните ввод заново.");
                counter = 0;
                continue;
            }
            operation = strLineOp;

            String strLineTwo = reader.readLine();
            if (strLineTwo.equals("stop")) {
                System.out.println("Вы ввели команду завершения работы.");
                break;
            }
            else if (strLineTwo.equals("c")) {
                System.out.println("Вы ввели команду сброса. Начните ввод заново.");
                counter = 0;
                continue;
            }
            two = Integer.parseInt(strLineTwo);

            Calculator calc = new Calculator();
            result = calc.enteringNumbers(one, two, operation);
            System.out.println("Ваш результат = " + result);
            one = result;
        }
        reader.close();
    }
}
