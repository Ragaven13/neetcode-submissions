//pattern : Greedy + Last Occurance + Start / End pointers

class Solution {
    public List<Integer> partitionLabels(String s) {

        int[] last = new int[26];

        for(int i = 0 ; i < s.length(); i++){
            last[s.charAt(i) - 'a'] = i;
        }


        List<Integer> result =new ArrayList<>();
        int start = 0;
        int end = 0;


        for(int i = 0 ; i < s.length(); i++) {

            char ch = s.charAt(i);

            end = Math.max(last[ch - 'a'],end);

            if(i == end){
                result.add(end - start + 1);
                start = i + 1;
            }



        }

        return result;
        
    }
}
