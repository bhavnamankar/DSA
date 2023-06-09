package com.company;

public class TwoStringEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String con1=" ";
        String con2=" ";
         boolean flag=false;
        for(int i=0;i< word1.length;i++){
            con1=con1+word1[i];

        }
        for(int z=0;z< word2.length;z++){
            con2=con2+word2[z];
            System.out.println(con2);
        }

if(con1.equals(con2)){
flag=true;
}
return flag;
    }
    public static void main(String[] args) {
       String[] word1 = {"ab", "c"};
       String[] word2 = {"a", "bc","op"};
        arrayStringsAreEqual(word1,word2);
    }
}
