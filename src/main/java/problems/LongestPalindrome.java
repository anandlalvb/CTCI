package problems;

import java.io.IOException;

class Solution {
    public String longestPalindrome(String s) {

        //System.out.println(isPalindrome(s));
        int length = s.length();
        int subs = 1;
        for(int i = 0; i < length; i++){
            //System.out.print("subs "+subs);
            for(int j = 0; j < subs; j++){
                //System.out.print("j "+j);
                //System.out.print(" ind " + (length+j-subs+1));
                String temp = s.substring(j, (length+j-subs+1));
                //System.out.println(" temp " + temp);
                if(isPalindrome(temp)) return temp;
            }
            subs++;
        }
        return "";
    }

    public boolean isPalindrome(String s){
        int length = s.length();
        int j = length-1;
        for(int i = 0; i< length/2; i++){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}

public class LongestPalindrome {

    public static void main(String[] args){
      String s = "baabfgfj";
      String ret = new Solution().longestPalindrome(s);
      System.out.println(ret);
    }
}
