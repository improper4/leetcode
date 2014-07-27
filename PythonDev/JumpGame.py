class Solution:
    # @param A, a list of integers
    # @return a boolean
    def canJump(self, A):
        max_step = 0
        for i in range(len(A) -1):
            if max_step == A[i] + i:
                return False
            max_step = max(max_step, A[i] + i)
        return max_step >= len(A)-1
        
cc = Solution()
print cc.canJump([3,2,1,0,4])