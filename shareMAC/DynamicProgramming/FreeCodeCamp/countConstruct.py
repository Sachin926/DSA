
def countConstruct(s, w):
	count = 0
	if (s == ""):
		return 1
	for i in w:
		if (i == s[0 : len(i)]):
			count = count + countConstruct(s[len(i) : ], w)
	return count
print (countConstruct("abcdef", ["ab", "abc", "cd", "def", "abcd"]))
print (countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeegedeeaefeeeeeeeeeeeeef",
	["e", "ee", "eee", "eeee", "eeeeee", "eeeeeeeeeee", "eeeeeeeeeeeeee"]))