/*
  21. Merge Two Sorted Lists
  Merge two sorted linked lists and return it as a new list. 
  The new list should be made by splicing together the nodes of the first two lists.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        
        ListNode ans;
        if(l1.val < l2.val){
            ans = l1;
            l1 = l1.next;
        }else{
            ans = l2;
            l2 = l2.next;
        }
        ListNode p = ans;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
            }else{
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        
        if(l1 != null)
            p.next = l1;
        else if(l2 != null)
            p.next = l2;
        
        return ans;
    }
}