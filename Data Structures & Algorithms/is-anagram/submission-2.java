class Solution {
    public boolean isAnagram(String s, String t) {


        // o(N) solution ia only anagrans are lower letter

        int[] ans = new int[26];

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length() ; i++){
            ans[s.charAt(i) - 'a']++;
            ans[t.charAt(i) - 'a']--;

        }

        for(int a : ans){
            if(a != 0){
                return false;
            }
        }


        return true;

        
    }
}
