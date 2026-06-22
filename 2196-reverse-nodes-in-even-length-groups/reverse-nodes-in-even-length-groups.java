class Solution {

    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevTail = dummy;
        ListNode curr = head;

        int groupSize = 1;

        while (curr != null) {

            int len = 0;
            ListNode temp = curr;
            ListNode tail = null;

            while (temp != null && len < groupSize) {
                tail = temp;
                temp = temp.next;
                len++;
            }

            if (len % 2 == 0) {

                ListNode nextGroupHead = temp;
                ListNode groupHead = curr;

                
                ListNode prev = nextGroupHead;
                ListNode node = curr;

                for (int i = 0; i < len; i++) {
                    ListNode next = node.next;
                    node.next = prev;
                    prev = node;
                    node = next;
                }

                prevTail.next = prev; 
                prevTail = groupHead; 
                curr = nextGroupHead;

            } else {

                prevTail = tail;
                curr = temp;
            }

            groupSize++;
        }

        return dummy.next;
    }
}