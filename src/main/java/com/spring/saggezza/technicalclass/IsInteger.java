package com.spring.saggezza.technicalclass;

public class IsInteger implements IIsInteger {
   public boolean isTypeInt(String input){
//       if(input.equals("1")|| input.equals("-4")){
//           return true;
//       } else {
//       return false;
       try {
           Integer.parseInt(input);
           return true;
       } catch(Exception e){
           return false;
       }
   }

}
