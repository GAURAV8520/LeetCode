/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void swap(int i,int j,int []arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void permutation(int index,int arr[],ArrayList<ArrayList<Integer>>ans){
        if(index==arr.length){
            ArrayList<Integer>ls=new ArrayList<>();
            System.out.println();
            for(int i=0;i<arr.length;i++){
                ls.add(arr[i]);
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            
            ans.add(new ArrayList<>(ls));
        }
        
        for(int i=index;i<arr.length;i++){
            swap(index,i,arr);
            permutation(index+1,arr,ans);
            swap(i,index,arr);
            
        }
    }
	public static void main(String[] args) {
		int arr[]={1,2,3};
		ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
		permutation(0,arr,ans);
	
	}
}
