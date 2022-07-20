def canSum(a, n):
	res = [False for i in range (n + 1)]
	res[0] = True
	for i in range (n + 1):
		if (res[i] == True):
			for j in a:
				if (j + i <= n):
					res[i + j] = True
	return res[n]

print (canSum([5, 3, 4], 7))