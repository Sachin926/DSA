def sums(n):
	if (n == 0):
		return 0
	else:
		sum = n + sums(n - 1)
		return sum
print (sums(9))