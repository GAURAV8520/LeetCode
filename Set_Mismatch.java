//645. Set Mismatch

/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]
 

Constraints:

2 <= nums.length <= 104
1 <= nums[i] <= 104
*/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum=0;
        int arr[]=new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

      for (Integer k : map.keySet()) {
            if (map.get(k) > 1) {
                arr[0] = k;
                break;
            }
        }

        HashSet<Integer> hs =new HashSet<>();

        for(int i=0;i<nums.length;i++){
             hs.add(nums[i]);
        }
        Iterator<Integer> it = hs.iterator(); 

          while (it.hasNext()) { 
  
            
            sum +=it.next();
        } 
        Arrays.sort(nums);

        int n=nums.length;

        int sum2=n*(n+1)/2;

        arr[1]=sum2-sum;

        return arr;
    }
}