class Solution:
	'''
	There are N gas stations along a circular route, where the amount
	of gas at station i is gas[i].
	
	You have a car with an unlimited gas tank and it costs cost[i] of
	gas to travel from station i to its next station (i+1). You begin
	the journey with an empty tank at one of the gas stations.

	Return the starting gas station's index if you can travel around
	the circuit once, otherwise return -1.
	'''
	# @param gas, a list of integers
    # @param cost, a list of integers
    # @return an integer
	def canComplete(self, gas, cost):
		res, tank = -1, 0
		for i in range(len(gas)):
			delt += gas[i] - cost[i]
			if gas[i] - cost[i] > tank:
				tank = gas[i] - cost[i]
				res = i
		if delt < 0:
			res = -1
		return res
cc = Solution()
