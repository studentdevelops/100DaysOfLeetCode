class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if(s.charAt(i) == letter){
                count+=1;
            }
        }
        int percentage = (int) Math.round((count* 100) /size)  ;
        return percentage ;
    }
}
