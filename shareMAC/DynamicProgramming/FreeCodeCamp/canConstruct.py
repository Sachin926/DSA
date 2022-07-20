def canConstruct(s, w):
	flag = 0
	if (s == ""):
		return True
	for i in w:
		if (i == s[0 : len(i)]):
			if (canConstruct(s[len(i) : ], w) == True):
				return True
	return False
print (canConstruct("abcdef", ["ab", "abc", "cd", "def", "abcd"]))
print (canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeegedeef",
	["e", "ee", "eee", "eeee", "eeeeee", "eeeeeeeeeee", "eeeeeeeeeeeeee"]))