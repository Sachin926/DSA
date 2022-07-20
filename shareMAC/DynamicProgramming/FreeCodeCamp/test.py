def main():
	n = int(input())
	a = 0
	b = 1
	c = a + b
	for i in range (3, n + 1):
		a = b
		b = c
		c = a + b
	print (c)
main()