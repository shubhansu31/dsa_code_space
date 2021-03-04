/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        int sizeA = 0 , sizeB = 0;
        ListNode tempHeadA = headA , tempHeadB = headB;
        while(tempHeadA != null){
            sizeA++;
            tempHeadA = tempHeadA.next;
        }
        while(tempHeadB != null){
            sizeB++;
            tempHeadB = tempHeadB.next;
        }
        
        tempHeadA = headA ;
        tempHeadB = headB;
        
        if(sizeA > sizeB){
            while(sizeA != sizeB){
                tempHeadA = tempHeadA.next;
                sizeA--;
            }   
        }
        else if(sizeA < sizeB){
            while(sizeA != sizeB){
                tempHeadB = tempHeadB.next;
                sizeB--;
            }
        }
        
        while(tempHeadA != null){
            if(tempHeadA == tempHeadB)
                return tempHeadA;
            tempHeadB = tempHeadB.next;
            tempHeadA = tempHeadA.next;
        }
        return null;
    }
}