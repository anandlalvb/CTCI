package problems;

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int maxWord = 0;
        if(length > 0){
            int left = 0;
            int right = 0;
            HashSet<Character> longest = new HashSet<Character>();
            //System.out.println("maxWord:: "+maxWord);
            //System.out.println("left:: "+left);
            //System.out.println("right:: "+right);
            while(right < length){
                //System.out.print("left:: "+left);
                //System.out.print("right:: "+right);
                //System.out.println("longest:: "+longest);
                if(longest.contains(s.charAt(right))){
                    //remove element
                    longest.remove(s.charAt(left++));
                }else{
                    longest.add(s.charAt(right++));
                    maxWord = Math.max(maxWord, longest.size());
                }

            }
        }
        return maxWord;
    }
}

public class LongestString {

    public static void main(String[] args) {
      //String s = "baabfgfj";
      String s = "abcabcbb";
      //String s = "bbbbb";
      //String s = "pwwkew";
      int longest = new Solution().lengthOfLongestSubstring(s);
      System.out.println(longest);
    }
}
