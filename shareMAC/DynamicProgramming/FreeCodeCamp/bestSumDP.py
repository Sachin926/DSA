
def bestSum(x, a, memo):
	mini = None
	if (x in memo):
		return memo[x]
	if (x == 0):
		return []
	if (x < 0):
		return None
	for i in a:
		arr = bestSum(x - i, a, memo)
		if (arr != None):
			temp = arr.copy()##very very very important step
			temp.append(i)
			if (mini != None):
				if (len(temp) < len(mini)):
					mini = temp
			else:
				mini = temp
	memo[x] = mini
	return mini
print (bestSum(7, [5, 3, 4, 7], {}))
print (bestSum(8, [2, 3, 5], {}))
print (bestSum(8, [1, 4, 5], {}))
print (bestSum(100, [1, 2, 5, 25], {}))
