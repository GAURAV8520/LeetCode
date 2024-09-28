/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static void reverArray(int i,int []arr){
        int n=arr.length;
        if(i>=n/2){
            return;
        }
         int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        
        reverArray(i+=1,arr);
    }
    public static void reverseanArray(int st,int end,int[] arr){
        if(st>=end){
            return;
        }
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
        
        reverseanArray(st+=1,end-=1,arr);
    
    }
	public static void main(String[] args) {
	    int arr[]={1,2,3,4,5,6};
		reverArray(0,arr);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]);
		}
	}
}
