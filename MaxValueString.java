package com.company;

public class MaxValueString {
    public static void maximumValue(String[] strs) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<strs.length;i++){
       String s= strs[i];
       boolean letter =false;
       for(int j=0;j<s.length();j++){
           if(strs[i].charAt(j)>='a' && strs[i].charAt(j)<='z'){
               letter=true;

           }
       }
if(letter){
    max=Math.max(max,strs[i].length());
}
else {
    max=Math.max(max,Integer.parseInt(strs[i]));

}
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
String[] strs = {"l2ic3","bob","3","4","00000"};
        maximumValue(strs);
    }
}
