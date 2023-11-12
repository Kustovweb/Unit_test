package sem3.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class evenOddNumberTest {
    Number num = new Number();
    @BeforeEach
    public void initEach() {
        num = new Number();
    }
    @Test
    public void testEvenOddNumberEven() {
        Assertions.assertTrue(num.evenOddNumber(6));
    }
    @Test
    public void testEvenOddNumberOdd() {
        Assertions.assertFalse(num.evenOddNumber(7));
    }

    @ParameterizedTest
    @ValueSource(ints = {25,50,100})
    public void testNumberInIntervalSuccess(int i) {
        Assertions.assertTrue(num.numberInInterval(i));
    }
    @ParameterizedTest
    @ValueSource(ints = {24,101})
    public void testNumberInIntervalFail(int i) {
        Assertions.assertFalse(num.numberInInterval(i));
    }
}
