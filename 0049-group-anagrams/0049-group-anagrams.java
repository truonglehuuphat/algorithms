class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> map = new HashMap<>();

        for(String str: strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            } 
            map.get(key).add(str);
            
        }
        // List<List<String>> res = new ArrayList<>();
        // for (List<String> subList : map.values()) {
        //     // System.out.println(subList);
        //     res.addAll(subList);
        // }
        return new ArrayList<>(map.values());
    }
}