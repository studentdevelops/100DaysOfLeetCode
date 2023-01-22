class Solution {
    public String interpret(String command) {
        String word = "";
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == 'G'){
                word = word + "G";
            } else if(command.charAt(i) == '('){
                if(command.charAt(i + 1) == ')'){
                    word = word + "o";
                    i++;
                } else if(command.charAt(i + 1) == 'a'){
                    word = word + "al";
                    i+=3;
                }
            }
        }
        return word;
    }
}
