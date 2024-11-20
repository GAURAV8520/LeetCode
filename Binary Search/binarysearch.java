/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static int binarySearch_RecursiveWay(int []arr,int target,int low,int high){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        
        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
            return binarySearch_RecursiveWay(arr,target,mid+1,high);
        }
        return binarySearch_RecursiveWay(arr,target,low,mid-1);
    }
    
    public static int binarySearch_InterativeWay(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            
            // int mid=(low+high)/2;
            int mid=(low+(high-low)/2);  //takes less time than upper method  2low-high-low/2=high+low/2
            
            //if high and low is very big number the Maxint+maxint!=int hence we should use long mid insted of int mid
            
            if(arr[mid]==target){
                return mid;
            }
            else if(target > arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        
        return -1;
    }
    
    
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9};
		int target=2;
		System.out.println(binarySearch_InterativeWay(arr,target));
		System.out.println(binarySearch_RecursiveWay(arr,target,0,arr.length-1));
	}
}
