
import java.util.*;
public class Main
{
    public static void PrintAllSubsequence(int index, ArrayList<Integer> ls,int arr[]){
        if(index==arr.length){
            System.out.print("[ ");
            for(int i=0;i<ls.size();i++){
                System.out.print(ls.get(i)+" ");
            }
            System.out.print("]");
            
            return;
        }
        
        ls.add(arr[index]);  //add in list
        PrintAllSubsequence(index+1,ls,arr); //take 
        ls.remove(ls.size()-1); //remove the last element that inserted before
        PrintAllSubsequence(index+1,ls,arr); //not take
        
    }
	public static void main(String[] args) {
	    
	    int arr[]={3,2,1};
	    ArrayList<Integer>ls=new ArrayList<>();
	    PrintAllSubsequence(0,ls,arr);
		
	}
}
