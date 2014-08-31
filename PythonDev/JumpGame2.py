class Solution:
	'''
	Given an array of non-negative integers, you are initially positioned at
	the first index of the array.

	Each element in the array represents your maximum jump length at that
	position.

	Your goal is to reach the last index in the minimum number of jumps.
	'''
	def jump(self, A):
		max_pos, cnt, cur = 0, 0, 0
		for i in range(len(A)):
			if i > cur:
				cnt += 1
				cur = max_pos
			max_pos = max(max_pos, A[i] + i)
		return cnt
cc = Solution()
print cc.jump([2,3,1,1,4])