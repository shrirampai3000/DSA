class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        String[] phone = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        Queue<String> queue = new LinkedList<>();
        queue.offer("");

        for (char digit : digits.toCharArray()) {
            String letters = phone[digit - '0'];
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String curr = queue.poll();

                for (char ch : letters.toCharArray()) {
                    queue.offer(curr + ch);
                }
            }
        }

        return new ArrayList<>(queue);
    }
}