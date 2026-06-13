class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < weights.length; i++){
            int c = 'a' + i;
            map.put((char)c, weights[i]);
        }
        String res = "";
        for(String s: words){
            int sum = 0;
            int v = 0;
            for(char c : s.toCharArray()){
                sum += map.get(c);
            }
            v = sum % 26;
            // for(Map.Entry<Character, Integer> entry: map.entrySet()){
                // if(v == entry.getValue()){
                    res += (char)('z' - v);
                // }
            // }
        }
        return res;
    }
}