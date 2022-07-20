def pow(a, b):
	p = 1
	if (b == 0):
		return 1
	else:
		p = a * pow(a, b - 1)
		return p
print (pow(2, 5))