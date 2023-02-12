class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            boolean flag = true;
            for (int j = 0; j < words[i].length(); j++) {
                for (int j2 = 0; j2 < allowed.length(); j2++) {
                    if (!allowed.contains(String.valueOf(words[i].charAt(j)))) {
                        flag = false;
                        break;
                    } 
                }
            }
            if (flag) {
                count++;
            }
        }

        return count;
    }
}
