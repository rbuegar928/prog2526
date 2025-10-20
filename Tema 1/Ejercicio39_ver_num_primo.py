# Determinar si un número introducido por el usuario es primo

a = int(input("Introduzca su número: "))
contador = 0
if a == 1 or a == 2:
    print("El número es primo")
else:
    i = 2
    while i < a:
        if (a % i == 0):
            print("El número no es primo.")
            break
if i == a - 1:
    print("Sí es primo.")
