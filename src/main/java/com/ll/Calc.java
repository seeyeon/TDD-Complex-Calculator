package com.ll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calc {

   public static int run(String expression) {

      List<String> params = Arrays.asList(expression.split(" "));
      int result = Integer.parseInt(params.get(0));

     for(int i=1; i< params.size(); i +=2){
        int number = Integer.parseInt(params.get(i+1));
        String operator = params.get(i);

        if(operator.equals("+")){
           result +=number;
        } else if(operator.equals("-")){
           result -=number;
        } else if(operator.equals("*")){
           result *=number;
        }
     }

     return result;
   }
}





