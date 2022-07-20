def maxProfit(wt, val, w, n):
	if (n == 0 or w == 0):
		return 0
	else:
		if (wt[n - 1] <= w):
			return max(val[n - 1] + maxProfit(wt, val, w - wt[n - 1], 
				maxProfit(wt, val, w, n - 1)))
		else:
			return maxProfit(wt, val, w, n - 1)
