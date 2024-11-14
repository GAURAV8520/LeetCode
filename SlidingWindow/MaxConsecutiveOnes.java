//1004. Max Consecutive Ones III


// think it is as longest subarray with atmost k zero 

//brute force approach
//tc:O(n^2)

class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int zero=0;

            for(int j=i;j<n;j++){
                if(nums[j]==0){
                    zero++;
                }
                if(zero<=k){
                    maxlen=Math.max(maxlen,j-i+1);

                }else{
                    break;
                }
            }
        }

        return maxlen;
    }
}
