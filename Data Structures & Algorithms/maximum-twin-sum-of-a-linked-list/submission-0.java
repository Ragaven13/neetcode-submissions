/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        // Step 1: Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Now slow is at start of second half

        // Step 2: Reverse second half
        ListNode prev = null;
        ListNode curr = slow;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // prev is head of reversed second half

        // Step 3: Calculate max twin sum
        ListNode first = head;
        ListNode second = prev;

        int maxSum = 0;

        while (second != null) {
            maxSum = Math.max(maxSum, first.val + second.val);

            first = first.next;
            second = second.next;
        }

        return maxSum;

        
    }
}