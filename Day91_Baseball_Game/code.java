class Solution {
    public boolean checkOps(String op) {
        String[] ops = { "+", "D", "C" };
        for (String string : ops) {
            if (string.equals(op)) {
                return true;
            }
        }
        return false;
    }
    public int calPoints(String[] operations) {
        ArrayList<String> list = new ArrayList<>();
        for (String item : operations) {
            if (!checkOps(item)) {
                list.add(item);
            } else {
                if (item.equals("+")) {
                        int val = Integer.parseInt(list.get(list.size() - 1))
                                + Integer.parseInt((list.get(list.size() - 2)));
                        list.add(String.valueOf(val));
                } else if (item.equals("D")) {
                    list.add(String.valueOf(Integer.parseInt(list.get(list.size() - 1)) * 2));
                } else if(item.equals("C")) {
                    list.remove(list.size() - 1);
                }
            }
        }
        int count = 0;
        for (String string : list) {
            count = count + Integer.parseInt(string);
        }
        return count;
    }
}
