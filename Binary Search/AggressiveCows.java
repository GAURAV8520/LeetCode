//brute force approach

class Solution {
    public static boolean possible(int dis,int arr[],int k){
        int last=arr[0];
        int count=1;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dis){
                last=arr[i];
                count++;
                
            }
            if(count>=k){
                return true;
            }
        }
        
        return false;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n=stalls.length;
        for(int i=1;i<stalls[n-1]-stalls[0];i++){
            if(possible(i,stalls,k)){
                continue;
            }else{
                return (i-1);
            }
        }
    
        
        return -1;
    }
}





//optimal approach
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.aggressiveCows(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public static boolean possible(int dis,int arr[],int k){
        int last=arr[0];
        int count=1;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dis){
                last=arr[i];
                count++;
                
            }
            if(count>=k){
                return true;
            }
        }
        
        return false;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n=stalls.length;
      
        int low=1;
        int high=stalls[n-1]-stalls[0];
        
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(mid,stalls,k)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
    
        
        return high;
    }
}
