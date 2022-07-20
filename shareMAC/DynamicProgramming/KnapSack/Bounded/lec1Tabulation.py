def knapSack(wt, val, sum, n):
	t = [[None for i in range (sum + 1)] for i in range (n + 1)]
	for i in range (n + 1):
		for j in range (sum + 1):
			if (i == 0 or j == 0):
				t[i][j] = 0
			else:
				t[i][j] = -1
	for i in range (1, n + 1):#Array
		for j in range (1, sum + 1):#Weights
			if (wt[i - 1] <= j):
				t[i][j] = max(t[i - 1][j], val [i -1] + t[i - 1][j - wt[i - 1]])
			else:
				t[i][j] = t[i - 1][j]
	return t[n][sum]
print (knapSack([1, 3, 4, 5], [1, 4, 5, 7], 7, 4))
