# Tabla de multiplicar de un número
num = int(input("Introduzca el número del que quiere ver la tabla: "))

for i in range (0,11):
    print(num, "x", i, "=", num*i)

