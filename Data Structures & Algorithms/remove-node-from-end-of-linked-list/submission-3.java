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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        
        while(temp != null){
            temp = temp.next;
            len++;
        }
        temp = head;
        int mid = len -n;
        if(mid == 0){
            temp = temp.next;
            return temp;
        }
        for(int i = 0; i < mid-1; i++){
            temp = temp.next;
        }
        if(temp.next == null){
            return null;
        }
        if(temp.next.next == null && n == len){
            temp = head;
            return temp.next;
        }
        temp.next = temp.next.next;
        temp = head;
        
        return temp;
    
    }
}
