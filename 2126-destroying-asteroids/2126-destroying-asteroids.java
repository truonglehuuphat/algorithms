class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int n = asteroids.length;
        for(int i = 0 ; i < n /2 ;i++){
            int temp = asteroids[i];
            asteroids[i] = asteroids[n-i-1];
            asteroids[n-i-1] = temp;
        }
        int i = 0, j = 0;
        long sum = mass;
        // for(i = 0; i < n; i++){
            // System.out.println(asteroids[i]);
            for(j = n - 1; j > i; j--){
                if(asteroids[j] <= sum){
                    sum += asteroids[j];
                } else {
                    break;
                }
            }
            // System.out.println(sum + " "+ asteroids[i]);
            if(asteroids[0] > sum){
                return false;
            }
        // }
        // System.out.println(i + " " + n);
        return true;
    }
}