class Solution:
    # @return an integer
    def reverse(self, x):
    	res = ''
        if x < 0:
            return 0 - self.reverse(-x)
        for x in str(x):
        	res = x + res
        return int(res)