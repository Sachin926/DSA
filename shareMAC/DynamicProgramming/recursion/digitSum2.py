def digiSum(n):
	if (n == 0):
		return 0
	else:
		return n % 10 + digiSum(n // 10)
print (digiSum(10021))