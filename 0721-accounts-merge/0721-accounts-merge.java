class Solution {
    HashSet<String> visited = new HashSet<>();
    Map<String, List<String>> adject = new HashMap<String, List<String>>();

    private void DFS(List<String> mergerAccounts,  String email){
        visited.add(email);
        mergerAccounts.add(email);

        if(!adject.containsKey(email)){
            return;
        }
        for(String emailNeighbor: adject.get(email)){
            if(!visited.contains(emailNeighbor)){
                DFS(mergerAccounts, emailNeighbor);
            }
        }
    }

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int accountListSize = accounts.size();
        for(List<String> account: accounts){
            int size = account.size();
            String email = account.get(1);
            for(int i = 2; i < size; i++){
                if(!adject.containsKey(email)){
                    adject.put(email, new ArrayList<>());
                }
                String emailAccount = account.get(i);
                adject.get(email).add(emailAccount);
                if(!adject.containsKey(emailAccount)){
                    adject.put(emailAccount, new ArrayList<>());
                }
                adject.get(emailAccount).add(email);
            }
        }
        List<List<String>> mergerAccounts = new ArrayList<>();
        for(List<String> account: accounts){
            List<String> mergerAccount = new ArrayList<>();
            String name = account.get(0);
            String emailFirst = account.get(1);
            mergerAccount.add(name);
            
            if(!visited.contains(emailFirst)){
                DFS(mergerAccount, emailFirst);
                Collections.sort(mergerAccount.subList(1,mergerAccount.size()));
                mergerAccounts.add(mergerAccount);
            }
        }
        return mergerAccounts;
    }
}