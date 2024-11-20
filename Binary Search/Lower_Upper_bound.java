 //lower bond means first index of element in array  where element is greater than of equal to target
    
    public static int lowerbond(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        
        return ans;
    }
    
    
    
    public static int upperbound(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        
        return ans;
    }
