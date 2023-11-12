package sem3.hw;

public class Number {
    //Задание 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
    //переданное число четным или нечетным:
    public boolean evenOddNumber(int n) {
       return n % 2 == 0;
    }

    //Задание 2. Разработайте и протестируйте метод numberInInterval,
    //который проверяет, попадает ли
    //переданное число в интервал (25;100)
    public boolean numberInInterval(int n) {
        return n >= 25 && n <= 100;
    }
}
