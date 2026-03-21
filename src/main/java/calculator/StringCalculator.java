package calculator;

public class StringCalculator {
    int add(String input) {
        int result = 0;

        String delimiter;
        String contents;

        if (input.startsWith("//")) {
            char custom = input.charAt(2);
            delimiter = "[,|:" + custom + "]";
            contents = input.substring(4);
        } else {
            delimiter = "[,|:]";
            contents = input;
        }

        String[] tokens = contents.split(delimiter);

        for (String token : tokens) {
            result += Integer.parseInt(token);
        }

        return result;
    }
}