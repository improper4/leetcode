# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @return a ListNode
    def addTwoNumbers(self, l1, l2):
        res = ListNode(0)
        tmp = res
        carry = 0
        while l1 != None and l2 != None:
            tmp.next = ListNode((l1.val + l2.val + carry) % 10)
            carry = (l1.val + l2.val + carry) / 10
            tmp = tmp.next
            l1 = l1.next
            l2 = l2.next
        if l1 == None:
            while l2 != None:
                tmp.next = ListNode((l2.val + carry) % 10)
                carry = (l2.val + carry) / 10
                tmp = tmp.next
                l2 = l2.next
        if l2 == None:
            while l1 != None:
                tmp.next = ListNode((l1.val + carry) % 10)
                carry = (l1.val + carry) / 10
                tmp = tmp.next
                l1 = l1.next
        if carry == 1:
            tmp.next = ListNode(1)
        return res.next