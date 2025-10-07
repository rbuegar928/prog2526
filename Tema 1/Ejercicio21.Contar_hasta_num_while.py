# Contar hasta un número (con while)
x = 1
n =int(input("Introduce el número hasta el que quieres contar: "))
while True:
    if x < n:
        print (x,end=",")
    else:
        break
    x += 1
print(x,end=".")
