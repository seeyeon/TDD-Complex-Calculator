package com.ll;

public class Calc {

   public static int run(String expression) {

      if(expression.contains("+")){
         String[] expre = expression.split("\\+");
         int num1 = Integer.parseInt(expre[0].trim());
         int num2 = Integer.parseInt(expre[1].trim());

         return num1 + num2;
      }

      if(expression.contains("-")){
         String[] expre = expression.split("\\-");
         int num1 = Integer.parseInt(expre[0].trim());
         int num2 = Integer.parseInt(expre[1].trim());

         return num1 - num2;
      }

      return 0;
   }
}




