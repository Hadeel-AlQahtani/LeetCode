class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> mergeNums = new ArrayList<>();

        for (Integer num1 : nums1) {
            mergeNums.add(num1);
        }

        for (Integer num2 : nums2) {
            mergeNums.add(num2);
        }

        Collections.sort(mergeNums);

        double median;
        int medianIndex = mergeNums.size() / 2;

        if (mergeNums.size() % 2 == 0) {
            median = (mergeNums.get(medianIndex) + mergeNums.get(medianIndex - 1)) / 2.0;
        } else {
            median = mergeNums.get(medianIndex);
        }

        return median;
        
    }
}
