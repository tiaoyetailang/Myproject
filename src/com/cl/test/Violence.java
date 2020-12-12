package com.cl.test;

public class Violence {
    public static void main(String[] args) {
        String s1="1234567";
        String s2="456";
        System.out.println(violencematch(s1, s2));
        String str1="BBC ABCDAB ABCDABCDABDE";
        String str2="ABCDABD";


    }

    public static  int[]kmpNext(String dest){
          int next[]=new int[dest.length()];
          next[0]=0;
        for (int i = 1,j=0; i <dest.length() ; i++) {
            if(dest.charAt(i)==dest.charAt(j)){
                j++;

            }
            next[i]=j;

        }

       return next;
    }

    private static int  violencematch(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        int i=0,j=0;
        while(i<s1.length&&j<s2.length){
             if(s1[i]==s2[j]){
                 i++;
                 j++;
             }else{
                 i=i-j+1;
                 j=0;

            }


        }
        if(j==s2.length){
            return i-j;
        }else{
            return -1;
        }



    }
}
