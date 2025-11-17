a = [1,2,3,4,5]
copia1 = a.copy()
copia2 = a[:]
copia3 = []
for e in a:
    copia3.append(e)
    
copia4 = a
copia4.remove(5)

print(a)
print(copia1)
print(copia2)
print(copia3)

copia3.remove(1)
print(copia3)
