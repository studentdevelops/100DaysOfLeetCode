class Solution {
    public String reverseWords(String s) {
        int size = s.length();
        if(size==1 || size == 0)
            return s;
        String[] sentence = s.split(" ");
        String returningSentence = "";
        for (int i = 0; i < sentence.length; i++) {
            char[] sArray = sentence[i].toCharArray();
            for (int j = 0; j < sArray.length/2; j++) {
                char temp = sArray[j];
                sArray[j] = sArray[(sArray.length - 1) - j];
                sArray[(sArray.length - 1) - j] = temp;
            }
            if(i!= sentence.length - 1)
                returningSentence += String.valueOf(sArray) + " ";
            else returningSentence += String.valueOf(sArray);
        }
        return returningSentence;
    }
}
