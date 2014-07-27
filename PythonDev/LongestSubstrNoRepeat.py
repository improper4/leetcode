class Solution:
	# @return an integer
	def lengthOfLongestSubstring(self, s):
		res = begin = 0
		letters = [-1] * 128
		for i in range(len(s)):
			begin = max(begin, letters[ord(s[i])] + 1)
			letters[ord(s[i])] = i
			res = max(res, i - begin +1)

		return res

	def solHelper(self):
		print self.lengthOfLongestSubstring('wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco')




if __name__ == '__main__':
	sol = Solution()
	sol.solHelper()
