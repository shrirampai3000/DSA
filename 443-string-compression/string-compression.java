class Solution {

    public int compress(char[] chars) {
        int write = 0;
        int i = 0;

        while (i < chars.length) {
            int count = 1;

            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            chars[write++] = chars[i];

            if (count > 1) {
                String cnt = Integer.toString(count);
                for (char c : cnt.toCharArray()) {
                    chars[write++] = c;
                }
            }

            i++;
        }
        return write;
    }
    
}