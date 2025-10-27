# Crear lista de 5 números y usar bucle range
suma = 0
lista = [21, 7, 92, 56, 208]
for elemento in range(len(lista)):
    suma = suma + lista[elemento]
    print ("La suma con el elemento actual,", elemento, "=", suma)
print("La suma final de todos los valores es:", suma)
