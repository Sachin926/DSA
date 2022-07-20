def occurance(a, n, x):
	if (n == 0):
		if (a[n] == x):
			return n
		else:
			return
	else:
		if (a[n] == x):
			return n
		else:
			return occurance(a, n - 1, x)

a = [1, 2, 3, 4, 5, 9, 7, 4, 5, 7, 5]
print (occurance(a, 10 , 7))   