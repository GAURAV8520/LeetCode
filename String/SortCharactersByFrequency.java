//451. Sort Characters By Frequency

/*
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

 

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
 

Constraints:

1 <= s.length <= 5 * 105
s consists of uppercase and lowercase English letters and digits

*/

class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);

            map.put(a,map.getOrDefault(a,0)+1);
        }


        PriorityQueue<Map.Entry<Character,Integer>>maxheap=new PriorityQueue<>((a,b)->Integer.compare(b.getValue(),a.getValue()));

        maxheap.addAll(map.entrySet());

        StringBuilder result=new StringBuilder();

        while(!maxheap.isEmpty()){

            Map.Entry<Character,Integer>entry=maxheap.poll();
            char ch =entry.getKey();
            int freq=entry.getValue();

            for(int i=0;i<freq;i++){
                result.append(ch);
            }

        }

        return result.toString();
    }
}
