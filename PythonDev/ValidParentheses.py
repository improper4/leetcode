class Solution:
    # @return a boolean
    def isValid(self, s):
        left_paren = ['(','[','{']
        right_paren = {']':'[','}':'{',')':'('}
        stack = []
        for x in s:
            if x in left_paren:
                stack.append(x)
            else:
                if len(stack) == 0 or right_paren[x] != stack[len(stack) -1]:
                    return False
                else:
                    stack.pop()
        return len(stack) == 0

cc = Solution()
print cc.isValid(']')