# Solicitar al usuario cuántos números quiere introducir y mostrarlos al revés
cantidad = int(input("Introduce la cantidad de números que desee introducir: "))
num =[]
for i in range (cantidad):
    num.append(int(input("Introduzca un número entero: ")))
#num.reverse()
# con el reverse está ya hecho pero lo queremos hacer nosotros
print("\nLos números en orden inverso son: ")
for i in range(len(num)-1,-1,-1):
    print(num[i])
