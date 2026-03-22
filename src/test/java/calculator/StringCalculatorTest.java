package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


class StringCalculatorTest {

    @Test
    @DisplayName("구분자를 기준으로 분리한 각 숫자의 합을 얻을 수 있다.")
    void testString() {
        // given
        StringCalculator stringCalculator = new StringCalculator();

        // when
        String[] parsed = stringCalculator.parser("//;\n1;2;3");
        String[] tokens = stringCalculator.validator(parsed);
        int actual = stringCalculator.add(tokens);

        // then
        assertThat(6).isEqualTo(actual);
    }
}