class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, String> words = new HashMap<String, String>();
        String[] sWords = s.split(" ");
        String[] patternArr = pattern.split("");
        if (sWords.length != patternArr.length) {
            return false;
        }
        for (int i = 0; i < sWords.length; i++) {
            if (words.containsKey(patternArr[i])) {
                if (!(words.get(patternArr[i]).equals(sWords[i]))) {
                    return false;
                }
            } else {
                if(!(words.containsValue(sWords[i]))){
                    words.put(patternArr[i], sWords[i]);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
