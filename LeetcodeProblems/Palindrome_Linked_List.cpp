#include <list>

struct ListNode {
     int val;
     ListNode *next;
     ListNode() : val(0), next(nullptr) {}
     ListNode(int x) : val(x), next(nullptr) {}
     ListNode(int x, ListNode *next) : val(x), next(next) {}
 };
 
class Solution {
public:

    // ListNode* reverse(ListNode* p){
        
    // }
    
    bool isPalindrome(ListNode* head) {
        // if(head == NULL) return head;

        // isPalindrome(head->next);
        bool isEquals = false;

        ListNode* temp = head;

        list<int> llist;

        while(temp != nullptr){
            llist.push_back(temp->val);
            temp = temp->next;
        }

        list<int> tempList = llist;

        // cout << llist.size();

        llist.reverse();
        

        if(llist == tempList){
            isEquals = true;
        }



        // while(temp != nullptr){
        //     if(q->val == temp->val) {
        //         isEquals = true;
        //         q = q->next;
        //         temp = temp->next;
        //     }
        // }

        // bool isEquals = temp == head;
       
    //    cout << temp->val;
    //    temp = temp->next;
       
        return isEquals;
    }
};