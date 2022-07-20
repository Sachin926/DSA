x = "babbcd"
y = "accbce"
m = len(x)
n = len(y)

def LCsubstring(x, y, m, n):
	t = [[None for i in range (n + 1)] for j in range (m + 1)]
	for i in range(m + 1):
		for j in range(n + 1):
			if (i == 0 or j == 0):
				t[i][j] = 0
	for i in range(1, m + 1):
		for j in range(1, n + 1):
			if (x[i - 1] == y[j - 1]):
				t[i][j] = 1 + t[i - 1][j - 1]
			else:
				t[i][j] = 0
	max = 0
	for i in range(m + 1):
		for j in range (n + 1):
			if (max < t[i][j]):
				max = t[i][j]
	return max

print (LCsubstring(x, y, m, n))