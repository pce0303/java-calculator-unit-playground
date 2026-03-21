package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    @DisplayName("구분자를 기준으로 분리한 각 숫자의 합을 얻을 수 있다.")
    void testString() {
        // given
        StringCalculator stringCalculator = new StringCalculator();

        // when
        int actual = stringCalculator.add("//;\n1;2;3");

        // then
        assertEquals(6, actual);
    }
}