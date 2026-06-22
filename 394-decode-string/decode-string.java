class Solution {
    public String decodeString(String s) {
        Stack<Integer> cs = new Stack<>();      
        Stack<StringBuilder> ss = new Stack<>(); 

        StringBuilder cur = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } 
            else if (c == '[') {
                cs.push(num);
                ss.push(cur);

                num = 0;
                cur = new StringBuilder();
            } 
            else if (c == ']') {
                int k = cs.pop();
                StringBuilder prev = ss.pop();

                for (int i = 0; i < k; i++) {
                    prev.append(cur);
                }

                cur = prev;
            } 
            else {
                cur.append(c);
            }
        }

        return cur.toString();
    }
}