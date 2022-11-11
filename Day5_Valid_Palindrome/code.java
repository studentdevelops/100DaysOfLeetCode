class Solution {
    public boolean isPalindrome(String s) {
        String filteredString = s.replaceAll( "[^a-zA-Z0-9]", "").toLowerCase();
        if(filteredString.length() == 0 || filteredString.length() == 1)
            return true;
        
        int size = filteredString.length();
        for (int i = 0, j=size - 1; i < size / 2; i++, j--) {
            // System.out.println(i+":"+j);
            if(filteredString.charAt(i) != filteredString.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
