# Calcular el factorial de un número

n = int(input("Introduce el número al que le quieres calcular el factorial: "))

for i in range(0,n):
    fact = n*i
    i = i - 1
    fact = fact*i
print("El factorial de", n, "es", fact)
