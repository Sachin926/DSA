def gridTraveller(m, n, memo):
	if ((m, n) in memo):
		return memo[(m, n)]
	if (m == 1 and n == 1):
		return 1
	if (m == 0 or n == 0):
		return 0
	else:
		memo[(m, n)] = gridTraveller(m - 1, n, memo) + gridTraveller(m, n - 1, memo)
		return memo[(m, n)]
print (gridTraveller(18, 18, {}))