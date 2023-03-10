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
    public ListNode detectCycle(ListNode head) {
        
        //토끼와 거북이 알고리즘
        ListNode rabbit = head;
        ListNode turtle = head;
        if(head == null) return null;
        while(rabbit != null && turtle.next != null && rabbit.next != null){
            rabbit = rabbit.next.next;
            turtle = turtle.next;
            
            if(rabbit == turtle){
                turtle = head;
                while(rabbit != turtle){
                    rabbit = rabbit.next;
                    turtle = turtle.next;
                }
                return turtle;
            }
        }
        return null;
    }
}