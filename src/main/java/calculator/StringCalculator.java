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
            try {
                int number = Integer.parseInt(token);
                if (number < 0) {
                    throw new RuntimeException("음수가 입력되었습니다.");
                }
                result += number;
            } catch (NumberFormatException e) {
                throw new RuntimeException("숫자가 아닌 문자열이 입력되었습니다.");
            }
        }

        return result;
    }
}