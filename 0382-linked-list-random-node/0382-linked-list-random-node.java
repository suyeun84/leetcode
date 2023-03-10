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
    ArrayList<Integer> list = new ArrayList<>();
    int ranNum = 0;
    public Solution(ListNode head) {
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
    }
    
    public int getRandom() {
        return list.get((int)(Math.random() * list.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */