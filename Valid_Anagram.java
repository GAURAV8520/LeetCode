//242. Valid Anagram

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 
Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
*/

//my approach :solved this question using hashmap
// time complexity :o(n)

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            
            char ch =s.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<t.length();i++){
            char k =t.charAt(i);

            if(map.get(k)!=null){
                if(map.get(k)==1){
                    map.remove(k);
                }else{
                    map.put(k,map.get(k)-1);
                }
            }
            else{
                return false;
            }
        }

        return map.isEmpty();
    }
}