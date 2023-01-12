class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            int starttime = startTime[i]; 
            int endtime = endTime[i];
            if(starttime <= queryTime && queryTime <= endtime){
                count++;
            }

        }
        return count;
    }
}
