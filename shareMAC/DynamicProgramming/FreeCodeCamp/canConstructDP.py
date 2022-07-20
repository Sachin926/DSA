def canConstruct(s, w, memo):
	if (s in memo):
		return memo[s]
	if (s == ""):
		return True
	for i in w:
		if (i == s[0 : len(i)]):
			if (canConstruct(s[len(i)  : ], w, memo) == True):
				memo [s] = True
				return True
	memo [s] = False
	return False
print (canConstruct("abcdef", ["ab", "abc", "cd", "def", "abcd"], {}))
print (canConstruct("skateboard", ["bo", "rd", "sk", "ata", "t", "boar"], {}))
print (canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeegedeeaefeeeeeeeeeeeeef",
						["e", "ee", "eee", "eeee", "eeeeee", "eeeeeeeeeee", "eeeeeeeeeeeeee"], {}))