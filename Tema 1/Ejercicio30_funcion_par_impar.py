# Función que devuelva si el número leído es par o impar

def parimpar(N1):
    if N1 % 2 == 0:
        return("El número introducido es par.")
    else :
        return("El número introducido es impar.")

N1 = int(input("Introduzca un número: "))

print(parimpar(N1))
