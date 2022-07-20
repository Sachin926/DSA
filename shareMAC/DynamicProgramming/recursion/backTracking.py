a = set()
def perm(s, start, end):
	global a
	if (start == end):
		a.add(s)
		print(s)
	else:
		for i in range (start, end):
			s = swap(s, start, i)
			perm(s, start + 1, end)
			s = swap(s, start, i)
def swap(s, i, j):
	l = list(s)
	temp = l[i]
	l[i] = l[j]
	l[j] = temp
	return "".join(l)
perm("AAA", 0, 3)
print(a)