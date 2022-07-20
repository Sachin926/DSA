def search(a, n, x):
	if (n == 0):
		if (a[n] == x):
			return 1
		else:
			return 0
	else:
		if (search(a, n - 1, x) == 1 or a[n] == x):
			return 1
		else:
			return 0
print (search([1, 2, 3, 4, 5], 4, 100))