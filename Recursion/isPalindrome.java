
public class Main
{
    public static boolean ispalindrome(int st,String a){
        int n=a.length();
        if(a.charAt(st)!=a.charAt(n-st-1)){
            return false;
        }
        if(st>=n/2){
            return true;
        }
        return ispalindrome(st+=1,a);
    }
    public static boolean isPalindrome(int s,int e,String a){
        if(a.length()==0){
            return false;
        }
        if(s>=e){
            return true;
        }
        if(a.charAt(s)!=a.charAt(e)){
            return false;
        }
        
        return isPalindrome(s+=1,e-=1,a);
        
    }
	public static void main(String[] args) {
		String a="gauravv";
	    System.out.print(ispalindrome(0,a));
		
	}
}
