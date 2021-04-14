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
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode();
        ListNode greater = new ListNode();
        ListNode l = less , g = greater , next = null;
        while(head != null){
            next = head.next;
            if(head.val < x){
                l.next = head;
                head.next = null;
                l = l.next;
            }
            else{
                g.next = head;
                head.next = null;
                g = g.next;
            }
            head = next;
        }
        l.next = greater.next;
        less = less.next;
        return less;
    }
}