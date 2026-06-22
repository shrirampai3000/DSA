class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        List<Integer> vals = new ArrayList<>();

        for (ListNode curr = head; curr != null; curr = curr.next) {
            vals.add(curr.val);
        }

        int start = 0;
        int group = 1;
        int n = vals.size();

        while (start < n) {
            int end = Math.min(start + group, n);
            int len = end - start;

            if (len % 2 == 0) {
                int l = start, r = end - 1;
                while (l < r) {
                    int temp = vals.get(l);
                    vals.set(l, vals.get(r));
                    vals.set(r, temp);
                    l++;
                    r--;
                }
            }

            start = end;
            group++;
        }

        ListNode curr = head;
        for (int val : vals) {
            curr.val = val;
            curr = curr.next;
        }

        return head;
    }
}