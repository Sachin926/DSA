def subsetSum(a, sum):
	n = len(a)
	t = [[None for i in range (sum + 1)] for j in range (n + 1)]
	for i in range(n + 1):
		for j in range (sum + 1):
			if (j == 0):
				t[i][j] = True
			if (i == 0 and j != 0):
				t[i][j] = False
	for i in range(n + 1):
		for j in range(sum + 1):
			if (a[i - 1] <= j):
				t[i][j] = t[i - 1][j] or t[i - 1][j - a[i - 1]]
			else:
				t[i][j] = t[i - 1][j]
	return t[n]

def minSumDiff():
	arr = [1, 6, 11, 5]
	sum = 0
	for i in arr:
		sum = sum + i
	temp = subsetSum(arr, sum)
	vect = []
	for i in range (sum // 2 + 1):
		if (temp[i] == True):
			vect.append(i)
	min = sum
	for i in vect:
		if (abs(2 * i - sum) <= min):
			min = abs(2 * i - sum)
	print (min)

minSumDiff()
