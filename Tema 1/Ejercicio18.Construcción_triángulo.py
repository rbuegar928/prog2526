#Calcular si se puede formar un triángulo
lado1 = int(input("Introduzca la medida de un lado: "))
lado2 = int(input("Introduzca la medida de otro lado: "))
lado3 = int(input("Introduzca la medida del último lado: "))
if lado1 == lado2 == lado3 :
    triangulo = "equilatero"
elif lado1 == lado2 != lado3 or lado1 != lado2 == lado3 or lado1 == lado3 != lado2 :
    triangulo = "isoceles"
elif lado1 != lado2 != lado3 :
    triangulo = "escaleno"
else :
    print("No se puede construir el triángulo")
print("El triangulo que podemos construir es", triangulo)
