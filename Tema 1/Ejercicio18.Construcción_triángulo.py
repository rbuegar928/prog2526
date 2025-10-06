#Calcular si se puede formar un triángulo
a = int(input("Introduzca la medida de un lado: "))
b = int(input("Introduzca la medida de otro lado: "))
c = int(input("Introduzca la medida del último lado: "))
if a + b > c and a + c > b and b + c > a:
    print("Se puede formar un triángulo con estos lados")
    if a == b == c :
        triangulo = "equilátero" #poner las comillas, si no da error por ser la variable triangulo
    elif a == b != c or a != b == c or a == c != b :
        triangulo = "isóceles"
    elif a != b != c :
        triangulo = "escaleno"
    else :
    print("No se puede construir el triángulo")
print("El triángulo que podemos construir es", triangulo) # Saldrá pase lo que pase por que está a la misma altura que el primer if
