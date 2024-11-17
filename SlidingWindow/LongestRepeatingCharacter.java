class Solution {

    // TC : O(N^2)
    // SC : O(26)

    public int characterReplacement(String s, int k) {
        int maxlen=0;
        int maxfreq=0;
        
        int n=s.length();
        for(int i=0;i<n;i++){
             int hasharr[]=new int[26];
             int max=0;
       
             for(int j=i;j<n;j++){
                hasharr[s.charAt(j)-'A']+=1;
                max=Math.max( hasharr[s.charAt(j)-'A'],max);
                if((j-i+1)-max<=k){
                    maxlen=Math.max(maxlen,j-i+1);
                }
                else{
                    break;
                }
             }
        }

        return maxlen;
    }

    // TC : O(N+N)=O(2N)
    // SC : O(26)

    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxlen=0;
        int hasharr[]=new int[26];
        int max=0;
        int l=0;
        int r=0;

        while(r<n){
            hasharr[s.charAt(r)-'A']+=1;
            max=Math.max(max,hasharr[s.charAt(r)-'A']);
            while((r-l+1)-max >k){
                hasharr[s.charAt(l)-'A']-=1;
                l++;
                
                for(int i=l;i<r;i++){
                    max=Math.max(max,hasharr[s.charAt(i)-'A']);
                }
            }
            if((r-l+1)-max <=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;
    }


    //TC : O(N)
    //SC : O(26)
    
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxlen=0;
        int hasharr[]=new int[26];
        int max=0;
        int l=0;
        int r=0;

        while(r<n){
            hasharr[s.charAt(r)-'A']+=1;
            max=Math.max(max,hasharr[s.charAt(r)-'A']);
            if((r-l+1)-max >k){
                hasharr[s.charAt(l)-'A']-=1;
                l++;
            }
            
            maxlen=Math.max(maxlen,r-l+1);
            
            r++;
        }
        return maxlen;
    }
}
