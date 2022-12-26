class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if((flowerbed.length == 1 && flowerbed[0] == 0) || n==0 ) return true;
        if(flowerbed.length == 1 && flowerbed[0] == 1 ) return false;
        int i = 0;
        int count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0) {
                if (i == 0 && flowerbed[i + 1] == 0) {
                    i++;
                    count++;
                } else if(i== flowerbed.length - 1 && flowerbed[i-1]==0) {
                    i++;
                    count++;
                }else if (flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
                    i++;
                    count++;
                }
            }
            if (i < flowerbed.length) {
                if (flowerbed[i] == 1) {
                    i++;
                }
            }
            i++;
            if (count >= n)
                return true;
        }
        return false;
    }
}
