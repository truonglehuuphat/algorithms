class Solution {
    public boolean isValid(String s) {
        List<Character> ans = new ArrayList<>();
        int index = 0 ;
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c=='{'){
                ans.add(c);
            } else {
                if(ans.size() == 0) return false;
                char chk = ans.get(ans.size() - 1);
                System.out.println(chk + " " + c);
                if(chk == '(' && c != ')' || chk == '{' && c != '}' || chk == '[' && c != ']'){
                    return false;
                } else {
                    ans.remove(ans.size() - 1);
                }
            }
        }

        return ans.size() == 0 ? true : false;
    }
}