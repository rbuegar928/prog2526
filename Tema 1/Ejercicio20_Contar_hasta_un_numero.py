# Contar hasta un número
n =int(input("Introduce el número hasta el que quieres contar: "))
for x in range (0,n):
    x = x + 1 
    print(x,end=",")# Con end = indicamos que lo escriba seguido no cada num en una línea
