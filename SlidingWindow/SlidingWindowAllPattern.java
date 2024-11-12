// there are four types of pattern 

// first : constant window 

public class Main
{
	public static void main(String[] args) {
		int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int k = 4;
		
		int max=0;
		int sum=0;
		int l=0;
		int r=k-1;
		for(int i=l;i<k;i++){
		    sum+=arr[i];
		}
		max=sum;
		
		while(r<arr.length-1){
		    sum-=arr[l];
		    l++;
		    r++;
		    sum+=arr[r];
		    
		    max=Math.max(max,sum);
		}
		
		System.out.println(max);
	}
}


// method 2 
// longest subarray or substring wherer condition 

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    
   
    //brute force approach 
    //tc : o(n2) sc:o(1)
    
    public static int longestSubArrayWithsumlessthanEqualtok(int arr[],int k){
        int max=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            
            int sum=0;
            
            for(int j=i;j<n;j++){
                
                sum+=arr[j];
                
                if(sum<=k){
                  max=Math.max(max,(j-i+1));
                }
                else if(sum>k){   //optimis the code if sum is greater not need to check further
                    break;
                }
            }
            
            
        }
        return max;
    }
    
     //better solution 
    //tc :O(n+n) sc:O(1)
    public static int longestSubArrayWithsumlessthanEqualtok2(int arr[],int k){
        int l=0;
        int r=0;
        int n=arr.length;
        int sum=0;
        int max=0;
        
        while(r<n){
            sum+=arr[r];
            while(sum>k){
                sum-=arr[l];
                l++;
            }
            if(sum<=k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        
        return max;
    }
    
     //optimal solution 
    //tc :O(n) sc:O(1)
    
    public static int longestSubArrayWithsumlessthanEqualtok3(int arr[],int k){
        int l=0;
        int r=0;
        int n=arr.length;
        int sum=0;
        int max=0;
        
        while(r<n){
            sum+=arr[r];
            if(sum>k){  //no need to decrease the len than max len as we want max length
                sum-=arr[l];
                l++;
            }
            if(sum<=k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        
        return max;
    }
	public static void main(String[] args) {
		int s[]={3,1,2,1}; 
		int k = 4;
		int ans=longestSubArrayWithsumlessthanEqualtok(s,k);
		System.out.println(ans);
		
		int ans2=longestSubArrayWithsumlessthanEqualtok2(s,k);
		System.out.println(ans2);
		
		int ans3=longestSubArrayWithsumlessthanEqualtok3(s,k);
		System.out.println(ans3);
	}
}


// third pattern 
// No of subarray where condtionn 

//fourth pattern 
//shortest or mininmum window condition

