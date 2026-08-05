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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode nn = new ListNode(-1);
        ListNode t1 = list1;
        ListNode t2 = list2;
        if(t1 == null && t2 == null) return null;
        if(t1 == null) return t2;
        if(t2 == null) return t1;
        ListNode temp = nn;
        while(t1!=null && t2!=null){
            if(t1.val == t2.val){
                temp.next = t1;
                temp = temp.next;
                // temp.next = t2;
                // temp = temp.next;
                t1 = t1.next;
                // t2 = t2.next;
            }
            else if(t1.val < t2.val){
                temp.next = t1;
                temp = temp.next;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                temp = temp.next;
                t2 = t2.next;
            }
        }
        while(t1 != null){
            temp.next = t1;
            temp = temp.next;
            t1 = t1.next;
        }
        while(t2 != null){
            temp.next = t2;
            temp = temp.next;
            t2 = t2.next;
        }
        return nn.next;
    }
}