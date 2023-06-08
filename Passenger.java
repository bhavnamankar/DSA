package com.company;

public class Passenger {
    public static  void countSeniors(String[] details) {
int count=0;
        for (int i = 0; i< details.length; i++) {
           int age=Integer.parseInt(details[i].substring(11,13));

           if(age>60){
               count++;
           }

        }
        System.out.println(count);
    }
    public static void main(String[] args) {
       String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        countSeniors(details);
    }
}
