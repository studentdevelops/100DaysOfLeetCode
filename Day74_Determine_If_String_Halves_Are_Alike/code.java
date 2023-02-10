class Solution {
    public boolean checker(char ch){
        char[] vowelArray = { 'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowelArray.length; i++) {
            if(vowelArray[i] == ch)
            return true;
        }
        return false;
    }
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int size = s.length() / 2;
        String firstHalf = s.substring(0, size);
        String secondHalf = s.substring(size);
        int firstCount = 0, secondCount = 0;

        for (int i = 0; i < size; i++) {
            if(this.checker(firstHalf.charAt(i))){
                firstCount++;
            }
            if(this.checker(secondHalf.charAt(i))){
                secondCount++;
            }
        }
        return firstCount == secondCount;
    }
}
