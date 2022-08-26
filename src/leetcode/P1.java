package leetcode;

//08/26/2022 09:56

public class P1 {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;

        int array[] = twoSum(nums, target);
        System.out.println("[" + array[0] + ", "+ array[1] + "]");
    }

    //Submitted
    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j){
                    int twoSum = nums[i] + nums[j];
                    if (target == twoSum){
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }
        return result;
    }

}


