package com.github.ArtemSinchuk.DivRem;

public class Division {
     double dividend = 0;
     double divisor = 0;

    public static void main( String[] args ) {
        Division d = new Division();
        d.defineNums();
        d.divide();
    }

    public void defineNums() {
        System.out.println("Dividend: " + dividend);
        System.out.println("Divisor: " + divisor);
    }

    public void divide() {
        int quotient = (int) (dividend / divisor);
        int rem = (int) (dividend % divisor);

        System.out.println(quotient + "; R = " + rem);
    }

    public static void divide(double a, double b) {

    }
}
