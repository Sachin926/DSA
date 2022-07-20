def canSum(x, a, memo):
	if (x in memo):
		return memo[x]
	if (x == 0):
		return True
	if (x < 0):
		return False
	else:
		for i in a:
			if (canSum(x - i, a, memo) == True):
				memo[x] = True
				return True
	memo[x] = False
	return False
print (canSum(300, [7, 14], {}))