/*
Question:
Create three classes: Calculator, ScCalculator, and HybridCalculator.
Group them into a package named `mycalculator`.

Calculator → performs basic operations like add, subtract, multiply, divide  
ScCalculator → performs scientific operations like sin, cos, power  
HybridCalculator → inherits both Calculator and ScCalculator

Demonstrate their use in a main program.

Expected Output:
Addition: 30
Subtraction: 10
Multiplication: 200
Division: 5
Power: 1024.0
Sine(90): 1.0
Cos(0): 1.0
*/

/* --------- File: mycalculator/Calculator.java --------- */
package mycalculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}

/* --------- File: mycalculator/ScCalculator.java --------- */
package mycalculator;

public class ScCalculator {
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double sin(double angleDegrees) {
        return Math.sin(Math.toRadians(angleDegrees));
    }

    public double cos(double angleDegrees) {
        return Math.cos(Math.toRadians(angleDegrees));
    }
}

/* --------- File: mycalculator/HybridCalculator.java --------- */
package mycalculator;

// HybridCalculator extends both functionality via composition
public class HybridCalculator {
    Calculator basic = new Calculator();
    ScCalculator sci = new ScCalculator();

    // You can expose methods from both
    public int add(int a, int b) { return basic.add(a, b); }
    public int subtract(int a, int b) { return basic.subtract(a, b); }
    public int multiply(int a, int b) { return basic.multiply(a, b); }
    public int divide(int a, int b) { return basic.divide(a, b); }

    public double power(double a, double b) { return sci.power(a, b); }
    public double sin(double angle) { return sci.sin(angle); }
    public double cos(double angle) { return sci.cos(angle); }
}

// main method to  test

import mycalculator.HybridCalculator;

public class Main {
    public static void main(String[] args) {
        HybridCalculator calc = new HybridCalculator();

        System.out.println("Addition: " + calc.add(20, 10));
        System.out.println("Subtraction: " + calc.subtract(20, 10));
        System.out.println("Multiplication: " + calc.multiply(20, 10));
        System.out.println("Division: " + calc.divide(20, 4));

        System.out.println("Power: " + calc.power(2, 10));
        System.out.println("Sine(90): " + calc.sin(90));
        System.out.println("Cos(0): " + calc.cos(0));
    }
}

/*
Output:
Addition: 30
Subtraction: 10
Multiplication: 200
Division: 5
Power: 1024.0
Sine(90): 1.0
Cos(0): 1.0
*/
