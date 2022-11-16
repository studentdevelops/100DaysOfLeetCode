class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            if(hm.size() == 26) break;
            hm.put(sentence.charAt(i),0);
        }
        if(hm.size()==26){
            return true;
        }
        return false;
    }
}
