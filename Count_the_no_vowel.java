package com.company;

public class Count_the_no_vowel {
    public static int vowelStrings(String[] words) {
        int count=0;


        for(int i=0; i<=2; i++){
            int first= words[i].charAt(0);
            int last = words[i].charAt(words[i].length()-1);

            if(first=='a' || first=='e' || first=='i'|| first=='o'||first=='u'   )
            {  if(last=='a' || last=='e' || last=='i'|| last=='o'||last=='u'   )

            {
                count++;
            }
            }
        }
        System.out.println(count);
        return count;    }

    public static void main(String[] args) {
       String[] words = {"are","amy","u"};
        vowelStrings(words);
    }
}
