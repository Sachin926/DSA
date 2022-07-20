def stringCombo(a, n, res):
	if (n == 0):
		print (res)
		return
	for i in a:
		temp = res + i
		stringCombo(a, n - 1, temp)
stringCombo(["a", "b", "c", "d"], 3, "")