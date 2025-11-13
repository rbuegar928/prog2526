def copiarArray (a):
    copia3 = []
    for e in a:
        copia3.append(e)
    return (copia3)

a = [1,2,3,4,5]
copia1 = a.copy()
copia2 = a[:]


print(a)
print(copia1)
print(copia2)
print(copiarArray(a))