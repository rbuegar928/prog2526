# Contar hasta un número (repetir hasta)
x = 1
n =int(input("Introduce el número hasta el que quieres contar: "))
while True:
    if x >= n:
         break
    elif x == n:
        print(x,end=",")
    else:
        print (x,end=",")
    x += 1
