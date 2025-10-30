# Solicitar al usuario cuántos números quiere introducir y mostrarlos al revés con while
cantidad = int(input("Introduce la cantidad de números que desee introducir: "))
num =[0]*cantidad
for i in range (cantidad):
    num[i] = (int(input("Introduzca un número entero: ")))
print("\nLos números en orden inverso son: ")
while i >= 0:
    print(num[i])
    i = i - 1