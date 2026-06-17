class Solution {
    public char processStr(String s, long k) {
        StringBuilder ans = new StringBuilder();
        long length = 0;
        for(char c: s.toCharArray()){
            if(c == '#'){
                length = length * 2;
            }  else if(c == '*'){
                if(length > 0){
                    length--;
                }
            } else if (c == '%' ) {
               
            } else {
                 length++;
            }
        }
        if(k + 1 > length){
            return '.';
        }
        
        char[] ch = s.toCharArray();
        for(int i = ch.length - 1; i >= 0; i--){
            char c = ch[i];
            switch(c){
                case '*':
                    length++;
                    break;
                case '#':
                    if(k+ 1 > (length + 1) /2){
                        k -= length/2;
                    }
                    length = length / 2;
                    break;
                case '%':
                    k = length - k - 1;
                    break;
                default:
                    if(k+1 == length){
                        return c;
                    }
                    length--;
                    break;
            }   
        }

        return '.';
    }
}