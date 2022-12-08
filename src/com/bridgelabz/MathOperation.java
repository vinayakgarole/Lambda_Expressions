package com.bridgelabz;

@FunctionalInterface
interface IMathFunction {

    int calculate(int a, int b);

    static void printResult(int a, int b, String function, IMathFunction functionObject) {
        System.out.println("RESULT OF " + function + " is " + functionObject.calculate(a, b));
    }
}

public class MathOperation {

    public static void main(String[] args) {

        IMathFunction add = Integer::sum;
        IMathFunction multiply = (int a, int b) -> a * b;
        IMathFunction divide = (int a, int b) -> a / b;

        IMathFunction.printResult(6, 3, "Addition", add);
        IMathFunction.printResult(6, 3, "Multiplication", multiply);
        IMathFunction.printResult(6, 3, "Division", divide);
    }
}