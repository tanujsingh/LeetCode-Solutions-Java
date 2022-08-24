# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        list = []
        curr = head
        while curr is not None:
            list.append(curr.val)
            curr = curr.next
        return list == list[::-1]