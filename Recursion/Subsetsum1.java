/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
    public static void subsetsum1(int index,int sum,int arr[],ArrayList<Integer>ls){
        if(index==arr.length){
            ls.add(sum);
            return;
        }
        
        sum+=arr[index];
        subsetsum1(index+1,sum,arr,ls);
        sum-=arr[index];
        subsetsum1(index+1,sum,arr,ls);
    }
    
	public static void main(String[] args) {
	    int arr[]={3,1,2};
	    ArrayList<Integer>ls=new ArrayList<>();
	    subsetsum1(0,0,arr,ls);
	    Collections.sort(ls);
	    for(int i=0;i<ls.size();i++){
	        System.out.println(ls.get(i));
	    }
	}
}
