class Solution {
    public boolean judgeCircle(String moves) {
        char[] MoveArray = moves.toLowerCase().toCharArray();
        HashMap<String, Integer> moveMap = new HashMap<String, Integer>();
        moveMap.put("vertical", 0);
        moveMap.put("horizontal", 0);
        for (int i = 0; i < MoveArray.length; i++) {
            if (MoveArray[i] == 'u') {
                moveMap.put("vertical", moveMap.get("vertical") + 1);
            } else if (MoveArray[i] == 'd') {
                moveMap.put("vertical", moveMap.get("vertical") - 1);
            } else if (MoveArray[i] == 'l') {
                moveMap.put("horizontal", moveMap.get("horizontal") + 1);
            } else if (MoveArray[i] == 'r') {
                moveMap.put("horizontal", moveMap.get("horizontal") - 1);
            }
        }

        for (int val : moveMap.values()) {
            if (val != 0)
                return false;
        }

        return true;
    }
}
