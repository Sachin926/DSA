def pathTraveller(n, m):
	a = [[0 for i in range(n + 1)] for i in range (m + 1)]	#very important step don't us another way of initialising the dounble dimensional list in python
	a[1][1] = 1
	for i in range (m + 1):
		for j in range (n + 1):
			if (i != m):
				a[i + 1][j] += a[i][j]
			if (j != n):
				a[i][j + 1] += a[i][j]
	return a[m][n]
print (pathTraveller(3, 3))