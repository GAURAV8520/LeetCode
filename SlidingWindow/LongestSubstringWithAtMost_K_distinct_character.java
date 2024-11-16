/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;
public class Main
{

  //brute force
    public static int findmaxlen(String a,int k){
        int maxlen=0;
        int n=a.length();
        for(int i=0;i<n;i++){
            HashSet<Character>set=new HashSet<>();
            for(int j=i;j<n;j++){
                set.add(a.charAt(j));
                if(set.size()>k){
                    break;
                }
                if(set.size()<=k){
                    maxlen=Math.max(j-i+1,maxlen);
                }
            }
        }
        return maxlen;
    } 

  //better
  
    public static int findmaxlen2(String a ,int k){
        int maxlen=0;
        int l=0;
        int r=0;
        int n=a.length();
        
        HashMap<Character,Integer>map=new HashMap<>();
        
        while(r<n){
            map.put(a.charAt(r),map.getOrDefault(a.charAt(r),0)+1);
            
            if(map.size()>k){
                while(map.size()>k){
                    map.put(a.charAt(l),map.get(a.charAt(l))-1);
                    if(map.get(a.charAt(l))==0){
                        map.remove(a.charAt(l));
                        
                    }
                    l++;
                }
            }
            
            if(map.size()<=k){
                int len=r-l+1;
                maxlen=Math.max(maxlen,len);
            }
            r++;
        }
        
        return maxlen;
    }


  //optimal O(N)
    public static int findmaxlen3(String a ,int k){
        int maxlen=0;
        int l=0;
        int r=0;
        int n=a.length();
        
        HashMap<Character,Integer>map=new HashMap<>();
        
        while(r<n){
            map.put(a.charAt(r),map.getOrDefault(a.charAt(r),0)+1);
            
            if(map.size()>k){
                
                    map.put(a.charAt(l),map.get(a.charAt(l))-1);
                    if(map.get(a.charAt(l))==0){
                        map.remove(a.charAt(l));
                        
                    }
                    l++;
                
            }
            
            if(map.size()<=k){
                int len=r-l+1;
                maxlen=Math.max(maxlen,len);
            }
            r++;
        }
        
        return maxlen;
    }
	public static void main(String[] args) {
// 		int ans=findmaxlen("aaabbccd",2);
// 		System.out.println(ans);
		int ans2=findmaxlen3("aaabbccd",2);
		System.out.println(ans2);
	}
}
