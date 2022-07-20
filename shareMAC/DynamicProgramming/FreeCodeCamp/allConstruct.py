def allConstruct(s, w):
	if (s == ""):
		return [[]]
	res = []
	for i in w:
		if (i == s[0 : len(i)]):
			arr = allConstruct(s[len(i) : ], w)
			temp = arr
			for j in range(len(temp)):
				temp[j].append(i)
			for j in temp:
				res.append(j)
	return res
print (allConstruct("abcdef", ["ab", "abc", "cd", "def", "abcd"]))
print (allConstruct("purple", ["purp", "p", "u", "r", "le", "purpl"]))
print (allConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeegedeeaefeeeeeeeeeeeeef",
	["e", "ee", "eee", "eeee", "eeeeee", "eeeeeeeeeee", "eeeeeeeeeeeeee"]))