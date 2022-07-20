a = [1, 5, 7, 3, 2, 4]

def coinMax(a, l, r):
	if (l + 1 == r):
		return max(a[l], a[r])
	else:
		return max(a[l] + min(coinMax(a, l + 2, r), coinMax(a, l + 1, r - 1)), a[r] + min(coinMax(a, l + 1, r - 1), coinMax(a, l, r - 2)))
print (coinMax(a, 0, len(a) - 1))

