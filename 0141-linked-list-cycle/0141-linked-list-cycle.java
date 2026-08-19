/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode l1=head;
        HashSet<ListNode> ar=new HashSet();
        while(l1!=null){
            if(ar.contains(l1)){
                return true;
            }
            ar.add(l1);
            l1=l1.next;
        }
        return false;

        
    }
}