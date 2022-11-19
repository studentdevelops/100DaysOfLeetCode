class Solution {
    public boolean bannedWord(String name, String[] banned) {
        if(banned.length == 0 ) return false;
        for (String words : banned) {
            if (name.equalsIgnoreCase(words)) {
                return true;
            }
        }
        return false;
    }
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] sen = paragraph.toLowerCase().split("[ !?',;.]+");
        int count = 0;
        String word = "";

        if(sen.length==1) return sen[0].toLowerCase();
        
        for (int i = 0; i < sen.length; i++) {
            if(bannedWord(sen[i], banned)){
                continue;
            }
            int innercount = 0;
            for (int j = 0; j < sen.length; j++) {
                if (bannedWord(sen[j], banned)) {
                    continue;
                }
                if (sen[i].equalsIgnoreCase(sen[j])) {
                    innercount++;
                }
            }
            if (innercount > count) {
                count = innercount;
                word = sen[i];
            }
        }
        return word;
    }
}
