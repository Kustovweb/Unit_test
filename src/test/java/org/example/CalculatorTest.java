package org.example;

import org.junit.Test;
import sem1.Calculator;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {

    @Test
    public void testcalculatorDiscount1() {
        // Рассчет скидки
        double result = sem1.Calculator.calculatorDiscount(600.0, 10);
        assertThat(result).isEqualTo(540.0);


    }

    @Test
    public void testcalculatorDiscount2() {
        //Покупка равна нулю
        double result = Calculator.calculatorDiscount(0.0, 10);
        assertThat(result).isEqualTo(0.0);
    }

    @Test
    public void testcalculatorDiscount3() {
        //Отрицательная сумма покупка
        assertThatThrownBy(() -> sem1.Calculator.calculatorDiscount(-100, 10))
                .isInstanceOf(ArithmeticException.class).hasMessage("Invalid arguments");
    }

    @Test
    public void testcalculatorDiscount4() {
        //Отрицательная скидка
        assertThatThrownBy(() -> sem1.Calculator.calculatorDiscount(100, -10))
                .isInstanceOf(ArithmeticException.class).hasMessage("Invalid arguments");
    }

    @Test
    public void testcalculatorDiscount5() {
        //Скидка больше 100%
        assertThatThrownBy(() -> sem1.Calculator.calculatorDiscount(100, 101))
                .isInstanceOf(ArithmeticException.class).hasMessage("Invalid arguments");
    }
}
