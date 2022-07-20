def display(a, n):
	if (n == 0):
		print (a[n])
	else:
		display(a, n - 1)
		print (a[n])
display([1, 2, 3, 4, 5], 4)
