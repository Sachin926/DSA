def ceil_function(n): 
    res = int(n) 
    return res if res == n or n < 0 else res+1 
def cars(n1, n2, x): 
    if n1>=n2: 
        return -1 
    rel = n2 - n1 
    tdb = (x+1)/rel 
    t = ceil_function(tdb) 
    return t 
 
n1=int(input()) 
n2=int(input()) 
x=int(input()) 
print(cars(n1, n2, x))