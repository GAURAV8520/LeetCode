/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void combinationsum(int index,int target,ArrayList<Integer>ls,int []arr){
        
        if(target==0){
            System.out.print("[ ");
            for(int i=0;i<ls.size();i++){
                System.out.print(ls.get(i));
            }
            System.out.print("]");
            System.out.println();
            
            
            return;
        }
        if(index==arr.length && target!=0){
            return;
        }
        
        if(arr[index]>target){
            return;
        }
        ls.add(arr[index]);
        target-=arr[index];
        combinationsum(index,target,ls,arr);
        ls.remove(ls.size()-1);
        target+=arr[index];
        combinationsum(index+1,target,ls,arr);
    }
public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[]={2,3,6,7};
		ArrayList<Integer>ls=new ArrayList<>();
		combinationsum(0,7,ls,arr);
	}
}
