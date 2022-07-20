k = 29
def isPrime(n):
	global k
	if (n == 2):
		if (k % 2 == 0):
			return 0
		else:
			return 1
	else:
		if (k % n == 0):
			return 0
		else:
			return isPrime(n - 1)
print (isPrime(k - 1))
