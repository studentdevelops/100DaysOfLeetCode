class Solution {
    public boolean helper(String word) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (String string : vowels) {
            if(word.toLowerCase().startsWith(string)){
                return true;
            }
        }
        return false;
    }
    public String toGoatLatin(String sentence) {
        String[] senStrings = sentence.split(" ");
        for (int i = 0; i < senStrings.length; i++) {
            if(helper(senStrings[i])){
                senStrings[i] = senStrings[i] + "ma";
            } else {
                senStrings[i] = senStrings[i].substring(1) + senStrings[i].substring(0,1) + "ma";
            }
            for (int j = 0; j < i+1; j++) {
                senStrings[i] = senStrings[i] + "a";
            }
        }
        return String.join(" ", senStrings);
    }
}
