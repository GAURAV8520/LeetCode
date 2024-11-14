//brute force 
// tc:O(n^2)
//sc:O(256)

// 3. Longest Substring Without Repeating Characters



class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int n=s.length();

        for(int i=0;i<n;i++){
            int hash[]=new int[256];

            for(int j=i;j<n;j++){                    // find all substring from i to end 
                if(hash[s.charAt(j)]==1){            // already represent
                    break;
                }
                int len=j-i+1;
                maxlen=Math.max(len,maxlen);
                hash[s.charAt(j)]=1;
            }

        }

        return maxlen;
    }
}
