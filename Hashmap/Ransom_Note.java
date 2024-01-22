//383. Ransom Note

/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
 
Constraints:
1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
*/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        //hashmap solution 
        HashMap<Character,Integer> map =new HashMap<>();


        for(int i =0;i<ransomNote.length();i++){
            char a=ransomNote.charAt(i);

            map.put(a,map.getOrDefault(a,0)+1);
        }

         for(int i=0;i<magazine.length();i++){
            char k =magazine.charAt(i);

            if(map.get(k)!=null){
                if(map.get(k)==1){
                    map.remove(k);
                }else{
                    map.put(k,map.get(k)-1);
                }
            }
            
        }

        return map.isEmpty();



        // int[] alph = new int[26];
        // for (int i = 0; i < magazine.length(); i++) {
        //     alph[magazine.charAt(i) - 'a']++;
        // }
        // for (int i = 0; i < ransomNote.length(); i++) {
        //     alph[ransomNote.charAt(i) - 'a']--;
        // }
        // for (int n : alph) {
        //     if (n < 0) return false;
        // }
        // return true;
      
    }
}