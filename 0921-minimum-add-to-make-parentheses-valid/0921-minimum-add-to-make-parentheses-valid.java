class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int add = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                open++;
            } 
            else { // ch == ')'
                if (open > 0) {
                    open--;
                } 
                else {
                    add++;
                }
            }
        }

        // Remaining '(' need closing ')'
        return add + open;
    }
}