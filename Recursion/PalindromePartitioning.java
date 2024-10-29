class Solution {
    public void findsubstring(String s,int index,List<List<String>>ans, List<String>ls){
        if(index==s.length()){
            ans.add(new ArrayList<>(ls));
            return;
        }

        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                ls.add(s.substring(index,i+1));
                findsubstring(s,i+1,ans,ls);
                ls.remove(ls.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s,int st,int end){
        while(st<=end){
            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String>ls=new ArrayList<>();
        findsubstring(s,0,ans,ls);
        return ans;
    }
}
