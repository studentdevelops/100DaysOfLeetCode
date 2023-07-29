class Solution {
    public int strStr(String haystack, String needle) {
        int curIndex = 0;
        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        if (needleArr.length > haystackArr.length) {
            return -1;
        }
        ArrayList<Integer> Indices = new ArrayList<Integer>();
        for (int i = 0; i < haystackArr.length; i++) {
            if (haystackArr[i] == needleArr[curIndex]) {
                Indices.add(i);
            }
        }
        for (int i = 0; i < Indices.size(); i++) {
            for (int j = Indices.get(i); j < (j + needleArr.length) && curIndex < needleArr.length
                    && j < haystackArr.length; j++) {
                if (haystackArr[j] == needleArr[curIndex]) {
                    curIndex++;
                } else {
                    break;
                }
            }
            if (curIndex == needleArr.length) {
                return Indices.get(i);
            }
            curIndex = 0;
        }
        return -1;
    }
}
