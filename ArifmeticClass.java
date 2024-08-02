public class ArifmeticClass {
    public static void main(String[] args) {

//        Реализовать программу, выводящую на экран результаты:
//        Сложения двух чисел
//        Вычитания двух чисел
//        Умножения двух чисел
//        Деления двух чисел
//        Каждая из арифметических операций должна быть реализована как отдельный метод.


        int num1 = 10;
        int num2 = 5;

        System.out.println("Сложение: " + add(num1, num2));
        System.out.println("Вычитание: " + subtract(num1, num2));
        System.out.println("Умножение: " + multiply(num1, num2));
        System.out.println("Деление: " + divide(num1, num2));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
