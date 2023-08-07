// 128. Longest Consecutive Sequence
// Medium
// 17.5K
// 765
// Companies
// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

 

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9
 

// Constraints:

// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        int max =0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1 ){
                 j=j+1;
                
            }
            else {
                 j=0;
            }
            if(nums[i+1]-nums[i]==1 && max<j){
                 max=j;
                
            }
        }return max+1;
    }
}