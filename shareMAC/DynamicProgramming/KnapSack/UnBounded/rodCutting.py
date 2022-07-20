def rodCutting(length, prize):
	n = len(prize)
	t = [[None for i in range (n + 1)] for j in range (n + 1)]
	for i in range (n + 1):
		for j in range (n + 1):
			if (i == 0 or j == 0):
				t[i][j] = 0
	for i in range (1, n + 1):
		for j in range (1, n + 1):
			if (length[i - 1] <= j):
				t[i][j] = max(t[i - 1][j], prize[i - 1] + t[i][j - length[i - 1]])
			else:
				t[i][j] = t[i - 1][j] 
	return t[n][n]
length = [1, 2, 3, 4, 5, 6, 7, 8]
prize = [1, 5, 8, 9, 10, 17, 17, 20]
print (rodCutting(length, prize))