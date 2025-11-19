p = [[5.0,10.5],[8.2,15.0],[1.5,3.0]]
suma = 0
for i in range(len(p)):
    for j in range(len(p[i])):
        if j == 1:
            suma = suma + (p[i][j])
print(f"La suma es: {suma}")

print("--------------------------------------------")
#Ahora quitando el if y for anidado
suma = 0
for i in range(len(p)):
    suma = suma + (p[i][1])
print(f"La suma es: {suma}")

print("--------------------------------------------")
#Ahora con un  while
suma = 0
i = 0
while i < len(p):
    suma = suma + (p[i][1])
    i = i + 1
print(f"La suma es: {suma}")