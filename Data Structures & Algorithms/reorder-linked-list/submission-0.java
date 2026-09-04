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
    public void reorderList(ListNode head) {
        // 1. Middle Element

            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }


        //2. Now split the list 

            ListNode second = slow.next;
            slow.next = null;

        //3. Reverse 2nd half of the list

            ListNode curr = second;
            ListNode prev = null;

            while(curr != null){
                ListNode next = curr.next;

                curr.next = prev;
                prev = curr;
                curr = next;
            }

            second = prev;
        
        //4. Merge this node

            ListNode first = head;

            while(second != null){

                ListNode firstNext = first.next;
                ListNode secondNext = second.next;

                first.next = second;
                second.next = firstNext;

                first = firstNext;
                second = secondNext;
            }
    }
}
