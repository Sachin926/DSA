def sumProblem(a, n, sum):
	t = [[None for j in range (sum + 1)] for i in range (n + 1)]
	for i in range (n + 1):
		for j in range (sum + 1):
			if (j == 0):
				t[i][j] = True
			if (i == 0 and j != 0):
				t[i][j] = False
	for i in range(1, n + 1):#array
		for j in range(1, sum + 1):#sums
			if (a[i - 1] <= j):
				t[i][j] = t[i - 1][j] or t[i - 1][j - a[i - 1]]
			else:
				t[i][j] = t[i - 1][j]
	print (t[n][sum])
sumProblem([2, 3, 7, 8, 10], 5, 11)