def frequency(a, n, x):
	if (n == 0):
		if (a[n] == x):
			return 1
		else:
			return 0
	else:
		if (a[n] == x):
			return 1 + frequency(a, n - 1, x)
		else:
			return frequency(a, n - 1, x)
a = [1, 2, 4, 5, 6, 7, 4, 2, 2, 3, 6]
print (frequency(a, len(a) - 1, 2))
