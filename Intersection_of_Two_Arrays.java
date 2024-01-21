//349. Intersection of Two Arrays

/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
*/

//time complexity using hashmap :O(n+m)  where n and m is lenght of arr 1 and arr 2

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {


        // using hashmap time complexity :O(n+m)

        HashSet<Integer> map =new HashSet<>();

        ArrayList<Integer>ls =new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            map.add(nums1[i]);
        } 

        for(int i=0;i<nums2.length;i++){
            if(map.contains(nums2[i])){
                map.remove(nums2[i]);
                ls.add(nums2[i]);
            }
        }
        
        // using arraylist
        
        // ArrayList<Integer> list1 =new ArrayList<>();
        // ArrayList<Integer> list2 =new ArrayList<>();


        // for(int i =0;i<nums1.length;i++){
        //     if(!list1.contains(nums1[i])){
        //         list1.add(nums1[i]);
        //     }
        // }


        // for(int i =0;i<nums2.length;i++){
        //     if(list1.contains(nums2[i])){

        //         if(!list2.contains(nums2[i])){
        //             list2.add(nums2[i]);
        //         }
        //     }
        // }

        int[] arr=new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            arr[i]=ls.get(i);
        }


        return arr;
      
    }
}
