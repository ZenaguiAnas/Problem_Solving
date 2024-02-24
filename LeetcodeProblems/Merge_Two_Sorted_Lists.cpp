
//  Definition for singly-linked list.
 struct ListNode {
     int val;
     ListNode *next;
     ListNode() : val(0), next(nullptr) {}
     ListNode(int x) : val(x), next(nullptr) {}
     ListNode(int x, ListNode *next) : val(x), next(next) {}
 };
 


class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* first = list1;
        ListNode* second = list2;
        ListNode* current = nullptr;
        ListNode* temp;

        if(list1==nullptr && list2==nullptr){
            return nullptr;
        }

        if(list1 == nullptr){
            return list2;
        } 

        if(list2 == nullptr){
                return list1;
        }

        while(first != nullptr && second != nullptr) {
            if(first->val < second->val){
                if(current == nullptr) {
                     current = first;
                     temp = first;
                    first = first->next;
                    temp->next = nullptr;
                } else {
                    if(first->val < second->val ){
                        current->next = first;
                        current = current->next;
                        first = first->next;
                        current->next = nullptr;
                    } else {
                        current->next = second;
                        current = current->next;
                        second = second->next;
                        current->next = nullptr;
                    }
                }
            }
             else {
                if(current == nullptr) {
                     current = second;
                     temp = second;
                    second = second->next;
                    temp->next = nullptr;
                } else {
                    if(second->val < first->val ){
                        current->next = second;
                        current = current->next;
                        second = second->next;
                        current->next = nullptr;
                    } else {
                        current->next = first;
                        current = current->next;
                        first = first->next;
                        current->next = nullptr;
                    }
                }
                
            }
        }

        if(first != nullptr) current->next = first;
        else current->next = second;

        return temp;
    }
};