suma = 0
numero = float(input("Introduce un número (0 para terminar): "))

while numero != 0:
    suma = suma + numero
    numero = float(input("Introduce un número (0 para terminar): "))
print("La suma total es:", suma)
