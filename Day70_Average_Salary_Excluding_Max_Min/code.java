class Solution {
    public double average(int[] salary) {
        double max = salary[0], min = salary[salary.length - 1];
        for (int i = 0; i < salary.length; i++) {
            if(salary[i] > max){
                max = salary[i];
            } else if(salary[i] < min){
                min = salary[i];
            }
        }
        double avg = 0;
        for (int i = 0; i < salary.length; i++) {
            if(!(salary[i] == max || salary[i] == min)){
                avg = avg + salary[i];
            }
        }
        return avg/(salary.length - 2);
    }
}
