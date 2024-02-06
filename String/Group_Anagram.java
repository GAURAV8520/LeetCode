//49. Group Anagrams
/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
 

Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters


*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


         Map<String, List<String>> map = new HashMap<>();

         for(int i=0;i<strs.length;i++){

             char arr[]=strs[i].toCharArray();

             Arrays.sort(arr);
             String sorted= new String(arr);

             if(!map.containsKey(sorted)){
                 map.put(sorted,new ArrayList<>());
             }

             map.get(sorted).add(strs[i]);

         }

         return new ArrayList<>(map.values());

      
        // List<List<String>>ans=new ArrayList<>();

        // for(int i=0;i<strs.length;i++){
        //     String k=strs[i];
        //     char arr[]=k.toCharArray();

        //     Arrays.sort(arr);
        //     String sortedWord1 = new String(arr);

        //     List<String>list=new ArrayList<>();


        //     for(int j=i;j<strs.length;i++){
                
        //     String k1=strs[j];
        //     char arr1[]=k1.toCharArray();
        //       Arrays.sort(arr1);
        //          String sortedWord2 = new String(arr1);

        //          if(sortedWord1.equals(sortedWord2)){
        //              list.add(strs[j]);
        //          }

        //     }
        //     ans.add(list);
        // }

        // return ans;
    }
}
