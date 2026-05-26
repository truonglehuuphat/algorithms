class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        Set<Character> st1 = new HashSet<>();
        Set<Character> st2 = new HashSet<>();
        for(char c: word.toCharArray()){
            if(c < 95){
                st1.add(c);
            } else {
                st2.add(c);
            }
             
        }

        if(st1.isEmpty() || st2.isEmpty() ) return 0;

        for(char c: st2){
            int temp = c - 32;
            // System.out.print(temp + " " + c);
            if(st1.contains((char)temp)){
                count++;
            }
        }
        return count;
    }
}