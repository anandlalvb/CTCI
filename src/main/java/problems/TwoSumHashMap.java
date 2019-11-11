package problems;
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        int count = 0;
        HashMap<Integer, Integer> pairIndices = new HashMap<Integer, Integer>();
        for(int number: nums){
            //System.out.println("number:: "+ number);
            //System.out.println("pairIndices:: "+ pairIndices);
            if(pairIndices.isEmpty()){//Special case
                pairIndices.put(target - number, count);
            }else{
                //System.out.println("pairIndices.get:: "+ pairIndices.get(number));
                if(pairIndices.containsKey(number)){
                    //System.out.println("Contains");
                    ret[0] = pairIndices.get(number);
                    ret[1] = count;
                }else{
                    pairIndices.put(target - number, count);
                }
            }
            count++;
        }
        return ret;
    }
}

public class TwoSumHashMap {

    public static void main(String[] args) {
      int[] nums = {2, 7, 11, 15};
      int[] ret = new Solution().twoSum(nums, 9);
      for(int num:ret){
        System.out.println(num);
      }
    }
}
