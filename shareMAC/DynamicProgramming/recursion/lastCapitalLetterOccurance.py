def lastCapital(s, n):
	if (n == 0):
		if (ord(s[n]) >= 65 and ord(s[n]) <= 92):
			return n
	else:
		if (ord(s[n]) >= 65 and ord(s[n]) <= 92):
			return n
		else:
			return lastCapital(s, n - 1)

print (lastCapital("pyThon", 5))
