//290. Word Pattern

/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 

Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.


*/


class Solution {
    public boolean wordPattern(String pattern, String s) {

        char a[] =pattern.toCharArray();

        String[] array1 = s.split(" ");


        if(a.length!=array1.length){
            return false;
        }


        HashMap<Character,String > map =new HashMap<>();
        


        for(int i=0;i<a.length;i++){

            char b=a[i];
            String k=array1[i];

            if(map.containsKey(b)){
                if(!k.equals(map.get(b))){
                    return false;
                }
            }
            else{

                if(map.containsValue(k)){
                    return false;
                }
                else{
                    map.put(b,k);
                }
            }

            

        }

        
       

        return true;
        
    }
}