# Procedimiento que devuelva si el número leído es par o impar
def parimpar(N1):
    if N1 % 2 == 0:
        print("El número introducido es par.")
    else :
        print("El número introducido es impar.")

# Programa principal
N1 = int(input("Introduzca un número: "))
(parimpar(N1))
