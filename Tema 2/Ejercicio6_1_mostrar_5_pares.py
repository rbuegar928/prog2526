pares = [0]*5

#Este método es usando if
posicion = 0 # para cambiar los números dentro del array
contador = 0 # contador de los números pares que llevamos
i = 1 # son los números que prueba
while contador < 5:
    if i % 2 == 0:
        contador = contador + 1
        pares[posicion] = i
        i = i + 1
        posicion = posicion + 1
    else:
        i = i + 1
print(pares)

#para hacerlo sin usar if aunque tampoco usamos array
for i in range (2,11,2):
    print(i)