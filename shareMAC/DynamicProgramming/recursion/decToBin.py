def decToBin(n):
	if (n == 0):
		return 0
	else:
		print (n % 2)
		return decToBin(n // 2)
decToBin(15)