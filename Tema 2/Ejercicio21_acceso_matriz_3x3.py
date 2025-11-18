M = [[1,2,3],[4,5,6],[7,8,9]]
print(M)
print(M[1][2])
print(M[1][1])

print("----------------------------------")

for i in M[1]:
    print (i)

print("----------------------------------")

for fila in M:
    for e in fila:
        print(e, end=" ")
    print()

print("----------------------------------")
M2 = [[0,0,0],[0,0,0],[0,0,0]]
for i in range (len(M)):
    for e in range (len(M[i])):
        if M[i][e] % 2 == 0:
            M2[i][e] = M[i][e]
            M[i][e] = 0
print(M)
print(M2)