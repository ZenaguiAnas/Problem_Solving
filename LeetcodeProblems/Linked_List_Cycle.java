package LeetcodeProblems;

public class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
  public boolean hasCycle(ListNode head) {

      boolean hasCycle = false;

      if(head == null) return false;

      if(head.next == null) return false;

      Map<ListNode, Boolean> list 
          = new HashMap<ListNode, Boolean>(); 

      while(head != null){
          if(list.containsKey(head) && list.get(head) == true){
              hasCycle = true;
              break;
          }

          list.put(head, true);
          head=head.next;
      }

      return hasCycle;
  }
}