/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
   public static void combinationSum2(int index, int target, ArrayList<Integer> ls, int arr[]) {
    if (target == 0) {
        System.out.print("[ ");
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }
        System.out.print("]");
        System.out.println();
        return;
    }
    if (index == arr.length) {
        return;  // No need for target check, it's already covered above.
    }

    // Correct the loop to include all elements and handle duplicates.
    for (int i = index; i < arr.length; i++) {
        // Skip duplicates.
        if (i > index && arr[i] == arr[i - 1]) {
            continue;
        }
        if (arr[i] > target) {
            break;  // No need to continue if the current number exceeds the target.
        }

        // Pick the current element and recurse.
        ls.add(arr[i]);
        combinationSum2(i + 1, target - arr[i], ls, arr);

        // Backtrack: Remove the element and restore the target.
        ls.remove(ls.size() - 1);
    }
}

   
public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[]={1,1,1,2,2};
		ArrayList<Integer>ls=new ArrayList<>();
		//combinationsum(0,7,ls,arr);
		combinationSum2(0,4,ls,arr);
	}
}
