class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> st = new HashSet<>();
        int countZero = 0;
        for(int i : arr){
            st.add(i*2);
            if(i == 0){
                countZero++;
            }
        }
        boolean flag = false;
        for(int i : arr){
            if(i == 0 ){
                continue;
            }
            if(st.contains(i)){
                flag = true;
                break;
            }
        }
        return flag || countZero >=2 ;
    }
}