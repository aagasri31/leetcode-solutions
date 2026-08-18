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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode l1;
        l1=head;
        while(l1!=null && l1.next!=null){
            
            if(l1.val==l1.next.val){
                l1.next = l1.next.next;
            }
            else{
                l1=l1.next;
            }
        }
     return head;
        
    }
}