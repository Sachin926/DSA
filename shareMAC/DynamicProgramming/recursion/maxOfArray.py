def maximum (a, n, max):
	if (n < -1):
		return max
	else:
		if (a[n] > max):
			max = a[n]
		max = maximum(a, n - 1, max)
		return max
print (maximum([100, 11, 6, 9, 3], 4, 0))