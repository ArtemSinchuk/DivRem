package com.github.artemsinchuk.divRem;

public class Division {

    public static String divide(double dividend, double divisor) {
        int quotient = (int) (dividend / divisor);
        int rem = (int) (dividend % divisor);

        if (divisor == 0) {
            return "Cannot divide by 0";
        } 
        return "Result: " + quotient + "; R = " + rem;
    }
}
