package com.divrem;

import java.util.Scanner;

public class DisivionTest {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.println("Enter two numbers:");
  int num1 = s.nextInt();
  int num2 = s.nextInt();
  int quotient = num1 / num2;
  int rem = num1 % num2;
  System.out.println(quotient + "; R = " + rem);

  }
}
