M = [["A","B","C"],["D","E","F"],["G","H","I"]]

fila = 0
columna = 0
while columna < len(M[0]):
    fila = 0
    while fila < len(M):
        print(M[fila][columna])
        fila = fila + 1
    columna = columna + 1

print("----------------------------------------------")

for i in range(len(M)):
    for j in range(len(M[0])):
        print(M[j][i])