//Union of two array

/*
Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.
Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.
Note : Elements are not necessarily distinct.

Input:
5 3
1 2 3 4 5
1 2 3
Output: 
5
Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.

*/

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer>map =new HashSet<>();
        
        for(int i=0 ;i<n;i++){
            map.add(a[i]);
        }
        
        for(int i=0 ;i<m;i++){
            map.add(b[i]);
        }
        
        return map.size();
    }
}