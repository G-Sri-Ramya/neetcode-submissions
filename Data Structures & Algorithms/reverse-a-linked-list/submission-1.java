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
    public ListNode reverseList(ListNode head) {
        ListNode dummy = null;
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode temp = null;
        ListNode curr = head;
        ListNode nn = curr.next;
        curr.next = temp;
        temp = curr;
        curr = nn;
        if(nn!=null) nn = nn.next;
        while(curr != null){
            curr.next = temp;
            temp = curr;
            curr = nn;
            if(nn != null) nn = nn.next;
        }
        return temp;
    }
}
