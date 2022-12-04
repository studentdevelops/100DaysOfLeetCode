
class Solution {
    public int romanToInt(String s) {
        int converted = 0;
        StringBuilder sb = new StringBuilder(s);
        for(int i=s.length() - 1; i>=0 ; i--){
            if(s.charAt(i)=='I'){
                converted = converted + 1;
            }
            else if(s.charAt(i) == 'V'){
                if( i!=0 && s.charAt(i - 1)=='I') {
                    converted = converted - 1;
                    i--;
                }
                converted = converted + 5;
            }
            else if(s.charAt(i) == 'X'){
                if(i!=0 && s.charAt(i - 1)=='I') {
                    converted = converted - 1;
                    i--;
                }
                converted = converted + 10;
            }
            else if(s.charAt(i) == 'L'){
                if(i!=0 && s.charAt(i - 1)=='X') {
                    converted = converted - 10;
                    i--;
                }
                converted = converted + 50;
            }
            else if(s.charAt(i) == 'C'){
                if(i!=0 && s.charAt(i - 1)=='X') {
                    converted = converted - 10;
                    i--;
                }
                converted = converted + 100;
            }
            else if(s.charAt(i)== 'D'){
                if(i!=0 && s.charAt(i - 1)=='C') {
                    converted = converted - 100;
                    i--;
                }
                converted = converted + 500;
            }            
            else if(s.charAt(i) == 'M'){
                if(i!=0 && s.charAt(i - 1)=='C') {
                    converted = converted - 100;
                    i--;
                }
                converted = converted + 1000;
            }
        }
        return converted;
    }
}
