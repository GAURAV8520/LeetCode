// there are four types of pattern 



// first : constant window 
public class Main
{
	public static void main(String[] args) {
		int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int k = 4;
		
		int max=0;
		int sum=0;
		int l=0;
		int r=k-1;
		for(int i=l;i<k;i++){
		    sum+=arr[i];
		}
		max=sum;
		
		while(r<arr.length-1){
		    sum-=arr[l];
		    l++;
		    r++;
		    sum+=arr[r];
		    
		    max=Math.max(max,sum);
		}
		
		System.out.println(max);
	}
}
