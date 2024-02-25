package LeetcodeProblems;

//  Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
  public ListNode reverseList(ListNode head) {
      ListNode back = null;
      ListNode current = null;
      ListNode temp = head;
      // back.next = null;

      // System.out.print(current.val);

      if(head == null) return null;

      if(head.next == null) return head;

      while(head != null){
          if(back == null){
              temp = head.next;
              back = head;
              back.next = null;
              head = temp;
          }


          temp = head.next;
          current = head;
          current.next = back;
          back = current;
          head = temp;

      }

      return current;
  }
}