class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        int iToFind = size - n;   
        ListNode prev = head;

        for (int i = 1; i < iToFind; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return head;
    }
}
