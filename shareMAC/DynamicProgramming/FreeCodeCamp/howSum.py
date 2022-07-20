def howSum(x, a):
	if (x == 0):
		return []
	if (x < 0):
		return "null"
	else:
		for i in a:
			arr = howSum(x - i, a)
			temp = arr
			if (temp != "null"):
				temp.append(i)
				return temp
		return "null"
print (howSum(14, [7, 14]))