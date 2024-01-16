// 1313. Decompress Run-Length Encoded List

/*
 We are given a list nums of integers representing a list compressed with run-length encoding.
Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.
Return the decompressed list.
*/

// My solution 

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int l =0;

        for(int i=0; i<nums.length; i+=2){
            l += nums[i];
        }
        int arr[] = new int[l];
        int k=0;
        for(int i=0 ; i<nums.length; i+=2){
            for(int j=0; j<nums[i]; j++){
                arr[k]=nums[i+1];
                k++;
            }
        }
        return arr;

    }
}