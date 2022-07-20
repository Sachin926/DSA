def floodFill(a, n, m, newFill, oldFill):
	row = len(a)
	col = len(a[0])
	if (n < 0 or n >= row or m < 0 or m >= col):
		return
	if (a[n][m] != oldFill):
		return
	a[n][m] = newFill
	floodFill(a, n - 1, m, newFill, oldFill)
	floodFill(a, n + 1, m, newFill, oldFill)
	floodFill(a, n, m - 1, newFill, oldFill)
	floodFill(a, n, m + 1, newFill, oldFill)
a = [[0, 0, 0, 1],
[0, 0, 1, 1],
[0, 0, 0, 2],
[2, 2, 2, 2]]
floodFill(a, 0, 0, 99, 0)
for i in a:
	print(i)