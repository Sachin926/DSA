
def bestSum(x, a):
	mini = "null"
	if (x == 0):
		return []
	if (x < 0):
		return "null"
	for i in a:
		arr = bestSum(x - i, a)
		temp = arr
		if (arr != "null"):
			temp.append(i)
			if (mini != "null"):
				if (len(temp) <= len(mini)):
					mini = temp
			else:
				mini = temp
	return mini
print (bestSum(7, [5, 3, 4, 7]))
print (bestSum(8, [2, 3, 5]))
print (bestSum(8, [1, 4, 5]))