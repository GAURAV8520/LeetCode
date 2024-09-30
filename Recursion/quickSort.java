/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partionIndex(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            
            if(i<j){
                swap(arr,i,j);
            }
            
        }
        
        swap(arr,low,j);
        return j;
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int parIndx=partionIndex(arr,low,high);
            quickSort(arr,parIndx+1,high);
            quickSort(arr,low,parIndx-1);
        }
    }
	public static void main(String[] args) {
		int arr[]={4,6,2,5,7,9,1,3};
		
		quickSort(arr,0,arr.length-1);
		
		System.out.print("[ ");
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.print("]");
		
		
	}
}
