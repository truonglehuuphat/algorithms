class Solution {
    public String processStr(String s) {
        StringBuilder  res = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            System.out.println(res + " " + s.charAt(i));
            int n = res.length();
            char c = s.charAt(i);
            if(c == '*'){
                if(n > 0){
                    res.deleteCharAt(n-1);
                }
            } else if(c == '#'){
                res.append(res);
            } else if(c == '%'){
                res.reverse();
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}