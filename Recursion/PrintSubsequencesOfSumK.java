/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;
public class Main
{
    public static void printSubsequenceOfSum3(int index,ArrayList<Integer>ls,int sum,int arr[]){
        if(index==arr.length){
            if(sum==3){
                System.out.print("[ ");
                for(int i=0;i<ls.size();i++){
                    System.out.print(ls.get(i)+" ");
                }
                System.out.print("]");
                System.out.println();
            }
            return;
            
        }
        
        ls.add(arr[index]);
        sum+=arr[index];
        printSubsequenceOfSum3(index+1,ls,sum,arr);
        ls.remove(ls.size()-1);
        sum-=arr[index];
        printSubsequenceOfSum3(index+1,ls,sum,arr);
        
    }
	public static void main(String[] args) {
		int arr[]={1,2,1};
		ArrayList<Integer>ls=new ArrayList<>();
		printSubsequenceOfSum3(0,ls,0,arr);
	}
}
