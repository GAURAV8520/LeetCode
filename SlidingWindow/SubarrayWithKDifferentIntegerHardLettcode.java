class Solution {

    //brute force TC:O(N^2)
  
    public int subarraysWithKDistinct(int[] nums, int k) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            HashSet<Integer>set=new HashSet<>();
            for(int j=i;j<n;j++){
                set.add(nums[j]);
                if(set.size()==k){
                    count++;
                }
                if(set.size()>k){
                    break;
                }
            }
        }
        return count;
    }



    
    //optimal solution 
    public int solve(int nums[],int k){
         int count=0;
        int n=nums.length;
        int l=0;
        int r=0;
        HashMap<Integer,Integer>map=new HashMap<>();

        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }    
            count+=(r-l+1);
            
            r++;
        }
        return count;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
       int x=solve(nums,k);
       int y=solve(nums,k-1);

       return x-y;
    }
}
