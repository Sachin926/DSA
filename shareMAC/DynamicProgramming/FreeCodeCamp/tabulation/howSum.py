def howSum(a, n):
	res = [None for i in range (n + 1)]
	res[0] = []
	for i in range (n + 1):
		if (res[i] != None):
			for j in a:
				if (i + j) <= n:
					if (i != 0):
						res[i + j] = [i, j]
					else:
						res[i + j] = [j]
	return res[n]
print (howSum([5, 3, 4], 7))