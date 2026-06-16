class Solution {
    public String processStr(String s) {
        // StringBuilder  res = new StringBuilder();
        StringBuilder  res = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            System.out.println(res + " " + s.charAt(i));
            int n = res.length();
            if(s.charAt(i) == '*'){
                if(n > 0){
                    res.delete(n-1, n);
                }
            } else if(s.charAt(i) == '#'){
                if(n > 0){
                    res.append(res);
                }
            } else if(s.charAt(i) == '%'){
                res.reverse();
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}