package calculator;

public class StringCalculator {
    int add(String input) {
        int result = 0;

        char custom = 0;

        if (input.startsWith("//")) {
            custom = input.charAt(2);
        }

        String delimiter = "[,|:" + custom + "]";
        String contents = input.substring(5);
        String[] tokens = contents.split(delimiter);

        for (String token : tokens) {
            result += Integer.parseInt(token);
        }

        return result;
    }
}