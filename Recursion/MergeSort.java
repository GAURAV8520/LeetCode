/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return;
    }
    public static void merge(int arr[],int low,int mid,int end){
       int left=low;
       int right=mid+1;
       ArrayList<Integer>ls=new ArrayList<>();
       
       while(left<=mid && right<=end){
           if(arr[left]<=arr[right]){
               ls.add(arr[left]);
               left++;
           }
           else{
               ls.add(arr[right]);
               right++;
           }
       }
       
       while(left<=mid){
           ls.add(arr[left]);
           left++;
       }
       while(right<=end){
           ls.add(arr[right]);
           right++;
       }
       int j=0;
       for(int i=low;i<=end && j<ls.size();i++){
           arr[i]=ls.get(j);
           j++;
       }
    }
    public static void mergeSort(int []arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[]={3,1,2,4,1,5,2,6,4};
		
		mergeSort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
