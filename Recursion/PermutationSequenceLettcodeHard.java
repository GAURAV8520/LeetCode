//brute force algo :
class Solution {
    public void swap(int i,int j,int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void findAllcombination(int arr[],int index,ArrayList<String>ans){
        if(index==arr.length){
            String a="";
            for(int i=0;i<arr.length;i++){
                a+=(arr[i]+"");
            }
            ans.add(a);
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(i,index,arr);
            
            findAllcombination(arr,index+1,ans);
            swap(index,i,arr);
        }
    }
    public String getPermutation(int n, int k) {
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }

        ArrayList<String>ans=new ArrayList<>();
        findAllcombination(arr,0,ans);
        Collections.sort(ans);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
        
        return ans.get(k-1);
    }
}


//optimal solution 
class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        ArrayList<Integer>ls=new ArrayList<>();

        for(int i=1;i<n;i++){
            fact*=i;
            ls.add(i);
        }
        ls.add(n);
        String ans="";
        k=k-1;
        while(true){
            ans=ans+ls.get(k/fact);
            ls.remove(k/fact);
            if(ls.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/ls.size();
        }

        return ans;
    }
}
