def count(n):
	if (n == 0):
		return 0
	else:
		return n % 10 + count(n // 10)
print (count(548))