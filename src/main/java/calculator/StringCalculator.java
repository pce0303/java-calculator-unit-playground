package calculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    private List<String> parser(String input) {
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
        List<String> list = new ArrayList<>();
        list.add(contents);
        list.add(delimiter);
        return list;
    }

    private int validator(List<String> list) {
        int result = 0;
        List<String> tokens = List.of(list.get(0).split(list.get(1)));

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

    public int add(String input) {
        List<String> parsed = parser(input);
        return validator(parsed);
    }
}