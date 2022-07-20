import sys 
def minimumCoins(coins, sum):
	n = len(coins)
	t = [[None for i in range (sum + 1)] for j in range (n + 1)]
	for i in range (n + 1):
		for j in range (sum + 1):
			if (i == 0):
				t[i][j] = sys.maxsize - 1
			if (j == 0 and i != 0):
				t[i][j] = 0
	for i in range (1, n + 1):
		if (i % coins[0] == 0):
			t[0][i] = i // coins[0]
		else:
			t[0][i] = sys.maxsize - 1
	for i in range (1, n + 1):
		for j in range (1, sum + 1):
			if (coins[i -1] <= j):
				t[i][j] = min(t[i - 1][j], 1 + t[i][j - coins[i - 1]])
			else:
				t[i][j] = t[i - 1][j]
	return t[n][sum]
coins = [1, 2, 3]
sum = 5
print (minimumCoins(coins, sum))