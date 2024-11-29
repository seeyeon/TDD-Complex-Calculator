package com.ll;

import java.util.ArrayList;
import java.util.List;

public class Calc {

   public static int run(String expression) {

      List<Integer> params = new ArrayList<>();
      int sum =0;

      if(expression.contains("+")){

         String[] numbers = expression.split(" \\+ ");
         for(int i=0; i<numbers.length; i++){
           params.add(Integer.parseInt(numbers[i].trim()));
         }

         for(int i : params){
            sum += i;
         }
         return sum;
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




