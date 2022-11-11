class Solution {
public static boolean isPalindrome(String s) {
        String filteredString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (filteredString.length() == 1 || filteredString.length() == 0) {
            return true;
        }
        if (filteredString.charAt(0) == filteredString.charAt(filteredString.length()
                - 1))
            return isPalindrome(filteredString.substring(1, filteredString.length() -
                    1));
        return false;
    }
}
