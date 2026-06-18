class Solution {
    public double angleClock(int hour, int minutes) {
        double difAngle = 6;
        double vachnho = 5;
        double hourAng = ((minutes / 12.0) * 6) +  ((hour % 12) * vachnho) * difAngle;
        double minuAng = minutes * difAngle;
        
        System.out.println(hourAng + " " + minuAng);
        if(minuAng > 180 ) {
            minuAng = 360 - minuAng;
            return Math.abs(hourAng + minuAng) > 180 ? Math.abs(360 - Math.abs(hourAng + minuAng)): Math.abs(hourAng + minuAng) ;
        }
        return Math.abs(hourAng - minuAng) > 180 ? Math.abs(360 - Math.abs(hourAng - minuAng)) : Math.abs(hourAng - minuAng);
    }
}