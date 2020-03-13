# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head == None:
            return None
        return self.reverse(head, None)

    def reverse(self, cur: ListNode, prev: ListNode) -> ListNode:
        if cur == None:
            return prev
        node = cur.next
        cur.next = prev
        return self.reverse(node, cur)
