//520. Detect Capital

/*
We define the usage of capitals in a word to be right when one of the following cases holds:
All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

Example 1:
Input: word = "USA"
Output: true

Example 2:
Input: word = "FlaG"
Output: false
 

Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.

*/

class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())){
            return true;
        }

        if(word.equals(word.toLowerCase())){
            return true;
        }
        


         for(int i=1;i<word.length();i++){
            if(word.charAt(i)-'A'<32){
                return false;
            }
        }

        return true;
    }
}