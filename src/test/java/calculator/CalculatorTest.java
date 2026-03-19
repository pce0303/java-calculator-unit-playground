package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @DisplayName("두개의 정수를 더한 결과를 반환할 수 있다.")
    @Test
    void testAdd() {
        // given
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.add(3, 6);

        // then
        assertEquals(9, actual);
    }

    @DisplayName("두개의 정수를 뺀 결과를 반환할 수 있다.")
    @Test
    void testSub() {
        // given
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.subtract(3, 6);

        // then
        assertEquals(-3, actual);
    }

    @DisplayName("두개의 정수를 곱한 결과를 반환할 수 있다.")
    @Test
    void testMul() {
        // given
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.multiply(3, 6);

        // then
        assertEquals(18, actual);
    }

    @DisplayName("두개의 정수를 나눈 결과를 반환할 수 있다.")
    @Test
    void testDiv() {
        // given
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.divide(6, 3);

        // then
        assertEquals(2, actual);
    }
}
