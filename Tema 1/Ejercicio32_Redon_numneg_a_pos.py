# Dado un número decimal negativo lo pase a positivo y lo redondee a un número entero.

num = float(input("Introduzca un número decimal negativo: "))
numRedon = round(num)# Redondear a un entero
numPosi = abs(numRedon) # Convertir a positivo

print(numPosi)
