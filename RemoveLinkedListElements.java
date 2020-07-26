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
    public ListNode removeElements(ListNode head, int val) {
        /*ListNode origHead=head;
        ListNode prev = null;
        while(head != null){
            if(head.val == val){
                if(prev == null){
                    prev=head;
                    head = head.next;
                    prev.next = null;
                    origHead=head;
                }else{
                    prev.next=head.next;
                    prev=head;
                    head=head.next;
                    prev.next=null;
                }         
            }else{
                prev=head;
                head = head.next;  
            }
            
        }
        return origHead;*/
        
          if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
        
    }
}
