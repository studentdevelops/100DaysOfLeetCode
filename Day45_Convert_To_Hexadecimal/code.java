class Solution {
    public String helper(int val) {
        String hex = "";
        switch (val) {
            case 10:
                hex = "a" + hex;
                break;
            case 11:
                hex = "b" + hex;
                break;
            case 12:
                hex = "c" + hex;
                break;
            case 13:
                hex = "d" + hex;
                break;
            case 14:
                hex = "e" + hex;
                break;
            case 15:
                hex = "f" + hex;
                break;
            default:
                hex = val + hex;
        }
        return hex;
    }
    public String toHex(int num) {
        if (num == 0 ) return "0";
        String hex = "";
        if (num > 0) {
            while (num != 0) {
                int remainder = num % 16;
                hex = helper(remainder) + hex;
                num /= 16;
            }
        } else {
            char[] binary = Integer.toBinaryString(num).toCharArray();
            for (int i = 0; i < binary.length; i += 4) {
                int hexa = ((binary[i] - '0') * 8) + ((binary[i + 1] - '0') * 4) + ((binary[i + 2] - '0') * 2)
                        + (binary[i + 3] - '0');
                hex = hex + helper(hexa) ;
            }
        }
        return hex;
    }
}
