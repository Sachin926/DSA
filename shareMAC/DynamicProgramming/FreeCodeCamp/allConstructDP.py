import copy
def allConstruct(s, w, memo):
	res = []
	if (s in memo):
		return memo[s]
	if (s == ""):
		return [[]]
	for i in w:
		if (i == s[0 : len(i)]):
			arr = allConstruct(s[len(i) : ], w, memo)
			temp = copy.deepcopy(arr)		#to prevent the changes from being reflected into the memo for recursive call
			for j in range(len(temp)):
				temp[j].append(i)
			for j in temp:
				res.append(j)
	memo[s] = res
	return res
print (allConstruct("abcdef", ["ab", "abc", "cd", "def", "abcd"], {}))
print (allConstruct("purple", ["purp", "p", "u", "r", "le", "purpl"], {}))
print (allConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeegedeeaefeeeeeeeeeeeeef",
	["e", "ee", "eee", "eeee", "eeeeee", "eeeeeeeeeee", "eeeeeeeeeeeeee"], {}))


'''
[['def', 'abc']]
[['le', 'purp'], ['le', 'p', 'r', 'u', 'p']]
'''