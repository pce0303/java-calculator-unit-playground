package calculator;

public class StringCalculator {
    int add(String input) {
        int result = 0;

        String[] tokens = input.split("[,|:]");

        for (int i = 0; i < tokens.length; i++) {
            result += Integer.parseInt(tokens[i]);
        }

        return result;
    }
}