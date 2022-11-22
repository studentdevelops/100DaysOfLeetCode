class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toLowerCase()) || word.equals(word.toUpperCase()))
            return true;

        if(word.charAt(0) == word.toUpperCase().charAt(0)){
            if (word.substring(1).equals(word.substring(1).toLowerCase()))
            return true;
        }
        
        return false;
    }
}
