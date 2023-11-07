package org.example;

public class Calculator {
    public static void main(String[] args) {
        System.out.printf("Результат операции: %s\n" , calculation(2,2,'+'));
        System.out.printf("Результат операции: %s\n" , calculation(4,2,'-'));
        System.out.printf("Результат операции: %s\n" , calculation(8,2,'/'));
    }
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-' :
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/' :
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }
}
