package problems;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int count = 0;
        int second = 0;
        boolean isFound = false;
        for(int number: nums){
            for(int j = count+1; j < nums.length; j++) {
                if(target == number + nums[j]){
                    isFound = true;
                    second = j;
                    break;
                }
            }
            if(isFound) break;
            count++;
        }
        return new int[]{count, second};

    }
}

public class TwoSum {

    public static void main(String[] args) {
      int[] nums = {2, 7, 11, 15};
      int[] ret = new Solution().twoSum(nums, 9);
      for(int num:ret){
        System.out.println(num);
      }
    }
}
