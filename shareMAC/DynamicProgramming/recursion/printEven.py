def printEven(n):
	if (n == 2):
		return 2
	else:
		if (n % 2 == 0):
			print (n)
		return printEven(n - 1)
print (printEven(10))