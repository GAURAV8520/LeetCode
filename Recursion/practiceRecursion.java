/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static void sumOftringle(int []arr){
        int ans[]=new int[arr.length-1];
        if(arr.length==1){
            System.out.println(arr[0]);
            return;
        }
        for(int i=1;i<arr.length;i++){
            ans[i-1]=arr[i]+arr[i-1];
        }
        sumOftringle(ans);
    }
    
    public static void printminMax(int index,int arr[],int min,int max){
        if(index==arr.length){
            System.out.println(max);
            System.out.println(min);
            return;
        }
        
        min=Math.min(min,arr[index]);
        max=Math.max(max,arr[index]);
        
        printminMax(index+1,arr,min,max);
        
        
        
    }
    
    public static char findFirstuppercaseletterinString(int index,String str){
        if(Character.isUpperCase(str.charAt(index))){
            return str.charAt(index);
        }
        return findFirstuppercaseletterinString(index+1,str);
    }
	public static int specialFibonaci(int a,int b,int index){
        if(index==0){
            return a;
        }
        if(index==1){
            return b;
        }
        
        return specialFibonaci(a,b,index-1)^specialFibonaci(a,b,index-2);
    }
    
	public static void main(String[] Targs) {
	    int arr[]={1, 2, 3, 4, 5,10,-5};
        //sumOftringle(arr);
        printminMax(0,arr,Integer.MAX_VALUE,Integer.MIN_VALUE);
        char a=findFirstuppercaseletterinString(0,"gaurAv");
        System.out.print(a);
	}
}
