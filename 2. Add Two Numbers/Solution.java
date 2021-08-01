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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, sum;
        ListNode sumList = null, newNode = null, currentNode = null;

        while (l1 != null || l2 != null) {

            sum = carry + (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            carry = sum / 10;
            newNode = new ListNode(sum % 10);

            if (sumList == null) sumList = newNode; 
            else currentNode.next = newNode;
            
            currentNode = newNode;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry == 1) newNode.next = new ListNode(1);
        
        return sumList;
    }
}
