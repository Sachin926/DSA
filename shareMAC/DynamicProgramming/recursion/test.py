l = set()
def binSequnce(n, res):
	global l
	if (n == 0):
		l.add(res * 2)
		print (res * 2)
		return
	s = "01"
	for i in s:
		temp = res + i
		binSequnce(n - 1, temp)
binSequnce(2,"")
print (l)
