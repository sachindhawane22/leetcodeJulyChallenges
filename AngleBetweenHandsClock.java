class Solution {
    public double angleClock(int hour, int minutes) {
        //hr hand 60 min 30 degree --> 30 min 15 degree --> 15 min 7.5 degree --> 1 min 0.5 degree
        //min hand 1 min 6 degree
        //12:30
        //30 *6 = 180 degree min
        //
        double angleOfHrHandInOneMin = 0.5 ;
        double angleOfMinHandInOneMin = 6 ;  
        double diff=0;
        
        double hrAngle = hour == 12 ? minutes * angleOfHrHandInOneMin : hour * 60 *
                                    angleOfHrHandInOneMin + minutes * angleOfHrHandInOneMin;
        double minAngle = minutes == 0 ? 0 : minutes * angleOfMinHandInOneMin;
        
        diff = minAngle - hrAngle > 0 ? minAngle - hrAngle : hrAngle - minAngle ;
        return diff > 180 ? diff = 360 - diff : diff;
        
    }
}
