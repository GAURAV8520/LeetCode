//904. Fruit Into Baskets


//brute force 
//tc:O(N^2)

class Solution {
    public int totalFruit(int[] fruits) {
        int maxlen=0;
        int n=fruits.length;
        for(int i=0;i<n;i++){
            HashSet<Integer>set=new HashSet<>();
            for(int j=i;j<n;j++){
                
                set.add(fruits[j]);
                
                if(set.size()<=2){
                    int len=j-i+1;
                    maxlen=Math.max(maxlen,len);
                }
                else{
                    break;
                }
            }
        }

        return maxlen;
    }
}



//better solution 
//tc:O(2N)

class Solution {
    public int totalFruit(int[] arr) {
        int maxlen=0;
        int n=arr.length;
        int l=0;
        int r=0;
        

        HashMap<Integer,Integer>map=new HashMap<>();

        while(r<n){

            map.put(arr[r],map.getOrDefault(arr[r],0)+1);

            if(map.size()>2){
                while(map.size()>2){
                    map.put(arr[l],map.get(arr[l])-1);
                    if(map.get(arr[l])==0){
                        map.remove(arr[l]);
                    }
                    l++;
                }
            }

            if(map.size()<=2){
                int len=r-l+1;
                maxlen=Math.max(maxlen,len);
            }

            r++;
        }

        return maxlen;
    }
}

//optimal solution
//tc:O(n)


class Solution {
    public int totalFruit(int[] arr) {
        int maxlen=0;
        int n=arr.length;
        int l=0;
        int r=0;
        

        HashMap<Integer,Integer>map=new HashMap<>();

        while(r<n){

            map.put(arr[r],map.getOrDefault(arr[r],0)+1);

            if(map.size()>2){
                
                    map.put(arr[l],map.get(arr[l])-1);
                    if(map.get(arr[l])==0){
                        map.remove(arr[l]);
                    }
                    l++;
                
            }

            if(map.size()<=2){
                int len=r-l+1;
                maxlen=Math.max(maxlen,len);
            }

            r++;
        }

        return maxlen;
    }
}
