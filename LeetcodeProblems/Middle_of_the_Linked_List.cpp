
//  * Definition for singly-linked list.
 struct ListNode {
     int val;
     ListNode *next;
     ListNode() : val(0), next(nullptr) {}
     ListNode(int x) : val(x), next(nullptr) {}
     ListNode(int x, ListNode *next) : val(x), next(next) {}
 };
 
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        if(head == nullptr){
            return head;
        }


        ListNode* temp = head;
        ListNode* target;
        int length = 0;
        int count = 0;

        while(head->next != nullptr ){
            length++;
            head = head->next;
        }

        while(temp != nullptr) {
            if(length%2 == 0){
                if(count == length/2) target = temp;
                temp = temp->next;
                count++;
            } else {
                if(count == (length+1)/2) target = temp;
                temp = temp->next;
                count++;
            }
        }

        return target;
    }
};