x = "abcdgh"
y = "abedhfr"
m = len(x)
n = len(y)
t = [[-1 for i in range (n + 1)] for j in range (m + 1)]
def LCS(x, y, m, n):
	if (t[m][n] != -1):
		return t[m][n]
	if (m == 0 or n == 0):
		return 0
	if (x[m - 1] == y[n - 1]):
		t[m][n] = 1 + LCS(x, y, m - 1, n - 1)
		return t[m][n]
	else:
		t[m][n] = max(LCS(x, y, m - 1, n), LCS(x, y, m, n - 1))
		return t[m][n]
print (LCS(x, y, m, n))