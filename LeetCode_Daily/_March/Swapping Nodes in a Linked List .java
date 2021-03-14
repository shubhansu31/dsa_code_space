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
    public ListNode swapNodes(ListNode head, int k) {
        int size = 0 ;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        
        int l = size - k + 1;
        if(l == k)
            return head;

        int k_val = 0 , l_val = 0;
        temp = head;
        for(int i = 1 ; i <= size ; i++){
            if(i == k)
                k_val = temp.val;
            if(i == l)
                l_val = temp.val;
            temp = temp.next;
        }

        temp = head;
        for(int i = 1 ; i <= size ; i++){
            if(i == k)
                temp.val = l_val;
            if(i == l)
                temp.val = k_val;
            temp = temp.next;
        }
        return head;
        
    }
}