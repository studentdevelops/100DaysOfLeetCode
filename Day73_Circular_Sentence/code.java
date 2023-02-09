class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] senStrings = sentence.split(" ");
        if(senStrings.length == 1){
            return senStrings[0].charAt(0) == senStrings[0].charAt(senStrings[0].length() - 1);
        }
        for (int i = 0; i < senStrings.length; i++) {
            int curSize = senStrings[i].length() - 1;
            if(i == senStrings.length - 1){
                if(senStrings[i].charAt(curSize) != senStrings[0].charAt(0)){
                    return false;
                }
                continue;
            }
            if(senStrings[i].charAt(curSize) != senStrings[i + 1].charAt(0))
                return false;
        }
        return true;
    }
}
