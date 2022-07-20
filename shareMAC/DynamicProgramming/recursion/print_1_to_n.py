def display(n):
	if (n == 1):
		print (1)
		return
	else:
		display(n - 1)
		print (n)

display(5)
