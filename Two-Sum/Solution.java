import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numList = new HashMap<Integer, Integer>();
        int[] indexes = new int[2];
        int dupeIndex = 0;
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            // System.out.println(nums.length);
            
            if(numList.containsKey(temp)){
                System.out.println("Duplicate Value as key!");
                dupeIndex = numList.get(temp);
                // System.out.println(dupeIndex);
            }
            numList.put(temp, i);
        }

        for(int tempNum: numList.keySet()){
            int tempSearch = target - tempNum;
            if(numList.get(tempSearch) == numList.get(tempNum)){
                indexes[0] = dupeIndex;
                indexes[1] = numList.get(tempNum);
            }
            else if(numList.containsKey(tempSearch)){
                indexes[0] = numList.get(tempSearch);
                indexes[1] = numList.get(tempNum);
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to my Solution!");

        int[] test1 = {2,7,11,15};
        int[] result;
        System.out.println("Running Test 1: [2,7,11,15] Target: 9");
        result = twoSum(test1, 9);
        System.out.println(Arrays.toString(result) + "\n");


        int[] test2 = {3,2,4};
        int[] result2;
        System.out.println("Running Test 1: [3,2,4] Target: 6");
        result2 = twoSum(test2, 6);
        System.out.println(Arrays.toString(result2) + "\n");

        int[] test3 = {3,3};
        int[] result3;
        System.out.println("Running Test 1: [3,3] Target: 6");
        result3 = twoSum(test3, 6);
        System.out.println(Arrays.toString(result3) + "\n");
    }
}
