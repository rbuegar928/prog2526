suma = 0
lista = [21, 7, 92, 56, 208]
# Crear lista de 5 números y usar bucle elemento
for elemento in lista:
    suma = suma + elemento
    print ("La suma con el elemento actual,", elemento, "=", suma)
print("La suma final de todos los valores es:", suma)

# Crear lista de 5 números y usar bucle range
suma = 0
for elemento in range(len(lista)):
    suma = suma + lista[elemento]
    print ("La suma con el elemento actual,", lista[elemento], "=", suma)
print("La suma final de todos los valores es:", suma)

# Crear lista de 5 números y usar bucle while
suma = 0
contador = 0
while contador < len(lista):
    suma = suma + lista[contador]
    print ("La suma con el elemento actual,", lista[contador], "=", suma)
    contador = contador + 1
print("La suma final de todos los valores es:", suma)
