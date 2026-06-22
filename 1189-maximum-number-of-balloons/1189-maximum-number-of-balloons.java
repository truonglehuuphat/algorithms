class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        int flag = 1;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < text.length();i++){
            if( text.charAt(i) == 'a' ||
                text.charAt(i) == 'o' ||
                text.charAt(i) == 'b' ||
                text.charAt(i) == 'l'||
                text.charAt(i) == 'n' ){
               map.put(text.charAt(i), map.getOrDefault(text.charAt(i),0)+1);
            }
        }
        if(map.size() != 5) return 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int c = entry.getValue();
            if(entry.getKey() == 'l' || entry.getKey() == 'o' ){
                c = c/2;
            }
            if(c < min){
                min = c;
            }
        }
        return min;
    }
}