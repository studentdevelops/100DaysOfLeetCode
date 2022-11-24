class Solution {
    public int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
        for (int i=0; i<ch.length ; i++) {
            boolean flag = false;
            for (int j=0; j<ch.length; j++) {
                if(i==j) continue;
                if(ch[i]==ch[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                return i;
            }
        }
        return -1;
    }
}
