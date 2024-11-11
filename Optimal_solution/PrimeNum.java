/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
    public static void findNumberofPrime(int n){
        boolean primearray[]=new boolean[n];
    
        Arrays.fill(primearray,true);
        
        for(int i=2;i<Math.sqrt(n);i++){
            if(primearray[i]==true){
                for(int j=i*i;j<n;j=j+i){
                    primearray[j]=false;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(primearray[i]==true){
                System.out.println(i);
            }
        }
    }
    
	public static void main(String[] args) {
		findNumberofPrime(100);
	}
}
