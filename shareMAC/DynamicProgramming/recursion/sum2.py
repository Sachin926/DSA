def sum(n, s):
	if (n == 0):
		return 0
	else:
		s = n + sum(n - 1, s)
		return s
print (sum(9, 0))