def fastPower(a, b):
	if (b == 0):
		return 1
	else:
		if (b % 2 == 0):
			return fastPower(a * a, b / 2) #fastPower(a , b / 2) ** 2 can also be used
		else:
			return a * fastPower(a, b - 1)
print (fastPower(3, 8))