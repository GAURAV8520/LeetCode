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

// optimal solution 
// tc :O(N)
// sc:O(256)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int l=0;
        int r=0;
        int n=s.length();
        int maxlen=0;

        while(r<n){
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r))>=l){
                    l=map.get(s.charAt(r))+1;
                }
            }
            int len=r-l+1;
            maxlen=Math.max(maxlen,len);
            map.put(s.charAt(r),r);
            r++;

        }

        return maxlen;
    }
}
