def canSum(x, a):
	if (x == 0):
		return True
	if (x < 0):
		return False
	else:
		for i in a:
			if (canSum(x - i, a) == True):
				return True
		return False
print (canSum(21, [7, 14]))