package sem1;


public class Calculator {

    public static double calculatorDiscount(double purchaseAmount, int discountAmount) {
        //purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        if (purchaseAmount < 0 || discountAmount < 0 || discountAmount > 100) {
            throw new ArithmeticException("Invalid arguments");
        }
        double discount = purchaseAmount * discountAmount / 100;
        return purchaseAmount - discount; // Метод должен возвращать сумму покупки со скидкой
    }
}
