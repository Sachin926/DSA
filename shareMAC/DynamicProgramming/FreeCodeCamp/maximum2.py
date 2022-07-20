def maximum(a, n):
	if (n == 0):
		return a[0]
	if (maximum(a, n - 1) > a[n]):
		return maximum(a, n - 1)
	else:
		return a[n]
print (maximum([20, 3, 10, 6, 7], 4))
