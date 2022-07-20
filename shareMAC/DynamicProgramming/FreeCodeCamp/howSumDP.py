def howSum(x, a, memo):
	if (x in memo):
		return memo[x]
	if (x == 0):
		return []
	if (x < 0):
		return "null"
	else:
		for i in a:
			arr = howSum(x - i, a, memo)
			if (arr != "null"):
				arr.append(i)
				memo[x] = arr
				return arr
		memo[x] = "null"
		return "null"
print (howSum(280, [7, 14], {}))