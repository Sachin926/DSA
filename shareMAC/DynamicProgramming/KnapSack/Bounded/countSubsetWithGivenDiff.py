def main():
	a = [1, 1, 2, 3]
	diff = 1
	sums = sum(a)
	s1 = int ((sums + diff) / 2) 
	print (countSum(a, s1))

def countSum(a, sum):
	n = len(a)
	t = [[None for i in range (sum + 1)] for i in range (n + 1)]
	for i in range (n + 1):
		for j in range (sum + 1):
			if (j == 0):
				t[i][j] = 1
			if (i == 0 and j != 0):
				t[i][j] = 0
	for i in range (1, n + 1):
		for j in range (1, sum + 1):
			if (a[i - 1] <= j):
				t[i][j] = t[i - 1][j] + t[i - 1][j - a[i - 1]]
			else:
				t[i][j] = t[i - 1][j]
	return t[n][sum]
main()