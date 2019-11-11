package problems;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);//Sort it
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int length = nums.length;
        HashMap<Integer, Integer> pairIndices = new HashMap<Integer, Integer>();

        for(int i = 0; i < length-2; i++){
            int left = i + 1;
            int right = length-1;
            int sum = 0 - nums[i];
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                while (left < right) {
                    //System.out.print("Tuple " +i);
                    //System.out.print("  "+left);
                    //System.out.println("  "+right);
                    if(sum == nums[left] + nums[right]){
                        List<Integer> threeSumset = new ArrayList<Integer>();
                        threeSumset.add(nums[i]);
                        threeSumset.add(nums[left]);
                        threeSumset.add(nums[right]);
                        ret.add(threeSumset);
                        while (left < right && nums[left] == nums[left+1]) left++;
                        while (left < right && nums[right] == nums[right-1]) right--;
                        left ++;
                        right --;
                    }else if (nums[left] + nums[right] < sum) {
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }

        return ret;
    }
}

public class ThreeSum {

    public static void main(String[] args) {
      int[] nums = {-1, 0, 1, 2, -1, -4};
      List<List<Integer>> ret = new Solution().threeSum(nums);
      for(List<Integer> numList:ret){
        System.out.print(numList.get(0));
        System.out.print(" " + numList.get(1));
        System.out.println(" " + numList.get(2));
      }
    }
}
