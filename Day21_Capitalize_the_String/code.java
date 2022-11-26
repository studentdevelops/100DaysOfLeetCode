class Solution {
    public String capitalizeTitle(String title) {
        title = title.trim().toLowerCase();
        String[] sen = title.split(" ");
        String newTitle ="";
        for (int i = 0; i < sen.length; i++) {
            if(sen[i].length() > 2){
                sen[i] = sen[i].substring(0,1).toUpperCase() +  sen[i].substring(1);
            }
            if(i!=sen.length-1){
                newTitle = newTitle + sen[i] + " ";
                continue;
            }
            newTitle = newTitle + sen[i];
        }
        
        return newTitle;
    }
}
