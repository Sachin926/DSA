def firstCapital(s, n):
	if (n == len(s) - 1):
		if (ord(s[n]) >= 65 and ord(s[n]) <= 92):
			return n
	else:
		if (ord(s[n]) >= 65 and ord(s[n]) <= 92):
			return n
		else:
			return firstCapital(s, n + 1)
print (firstCapital("pyThnN", 0))