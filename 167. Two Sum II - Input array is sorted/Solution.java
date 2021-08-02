class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] + numbers[j] == target){
                    int[] solution = {i+1 ,j+1 };
                    return solution;
                }
            }
        }
        
        return null;
        
    
    }
}
