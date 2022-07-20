def fib(n):
	a = [0] * (n + 1)
	a[1] = 1
	for i in range (n):
		a[i + 1] = a[i + 1] + a[i]
		try:
			a[i + 2] = a[i + 2] + a[i]
		except:
			pass
	return a[n]
print (fib(6))