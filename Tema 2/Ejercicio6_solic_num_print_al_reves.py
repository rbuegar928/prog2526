# Solicitar al usuario cuántos números quiere introducir y mostrarlos al revés
cantidad = int(input("Introduce la cantidad de números que desee introducir: "))
num =[]
for i in range (cantidad):
    num.append(int(input("Introduzca un número entero: ")))
num.reverse()
print(num)
