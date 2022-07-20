def atoiFun(s, n):
	if (n == 0):
		return int (s[0])
	else:
		return atoiFun(s, n - 1) * 10 + int (s[n])
print (atoiFun("41216", 4))
print (type (atoiFun("41216", 4)))