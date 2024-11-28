package com.ll;

public class Calc {

   public static int run(String expression) {

      String[] expre = expression.split("\\+");
      int num1 = Integer.parseInt(expre[0].trim());
      int num2 = Integer.parseInt(expre[1].trim());

      return num1 + num2;

   }
}




