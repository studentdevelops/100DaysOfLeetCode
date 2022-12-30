class Solution {
    public String sortSentence(String s) {
       String senString = "";
        String[] senStrings = s.split(" ");
        int count = 1;
        int i = 0;
        while (i < senStrings.length) {
            if (senStrings[i].contains(String.valueOf(count))) {
                if (count < senStrings.length ) {
                    senString = senString + senStrings[i] + " ";
                } else {
                    senString = senString + senStrings[i];
                }
                count++;
            }
            i++;
            if (i == senStrings.length) {
                if (count != senStrings.length + 1) {
                    i = 0;
                }
            }
        }
        return senString.replaceAll("[0-9]", "");
    }
}
