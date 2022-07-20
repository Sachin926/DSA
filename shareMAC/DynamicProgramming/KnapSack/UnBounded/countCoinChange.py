def countCoinChange(coin, sum):
	n = len(coin)
	t = [[None for i in range (sum + 1)] for j in range (n + 1)]
	for i in range (n + 1):
		for j in range (sum + 1):
			if (j == 0):
				t[i][j] = 1
			if (i == 0 and j != 0):
				t[i][j] = 0
	for i in range (1, n + 1):
		for j in range (1, sum + 1):
			if (coin[i - 1] <= j):
				t[i][j] = t[i - 1][j] + t[i][j - coin[i - 1]]
			else:
				t[i][j] = t[i - 1][j]
	return t[n][sum]

coin = [1, 2, 3]
sum = 5
print (countCoinChange(coin, sum))