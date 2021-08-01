class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> listOfSums = new ArrayList<>();
        List<Integer> singleSum;
        Arrays.sort(nums);
        
        if (nums.length == 0 || nums[0] * 4 > target || nums[nums.length - 1] * 4 < target) {
            return listOfSums;
        }

        for (int num1 = 0; num1 < nums.length; num1++) {
            for (int num2 = num1 + 1; num2 < nums.length; num2++) {
                for (int num3 = num2 + 1; num3 < nums.length; num3++) {
                    for (int num4 = num3 + 1; num4 < nums.length; num4++) {
                        if (nums[num1] + nums[num2] + nums[num3] + nums[num4] == target) {
                            singleSum = new ArrayList<>();
                            singleSum.add(nums[num1]);
                            singleSum.add(nums[num2]);
                            singleSum.add(nums[num3]);
                            singleSum.add(nums[num4]);
                            if (!listOfSums.contains(singleSum)) {
                                listOfSums.add(singleSum);
                            }
                        }
                    }
                }
            }
        }

        return listOfSums;
    }
}
