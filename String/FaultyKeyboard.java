class Solution {
    public String finalString(String s) {
         StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'i'){
                sb.reverse(); // When value of s is 'i' it reverse the sb
            } else {
                sb.append(s.charAt(i)); // To add string character  into StringBuilder
            }
        }
        return sb.toString();
    }
}
