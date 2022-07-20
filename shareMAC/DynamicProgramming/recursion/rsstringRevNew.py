def rev(s, n):
	if (n == 0):
		return s[0]
	else:
		str =  s[n] + rev(s, n - 1)
		return str
print (rev("PYTHON", 5))