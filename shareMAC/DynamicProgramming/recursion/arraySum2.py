def sum(a, n):
	if (n == 0):
		return a[0]
	else:
		return a[n] + sum(a, n - 1)
print (sum([1, 2, 3, 4, 5], 4))