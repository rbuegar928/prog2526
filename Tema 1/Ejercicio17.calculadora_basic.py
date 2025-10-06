operación = input("Indique la operación que quiere realizar\n+ para suma\n- para resta\n* para multiplicación\n/ para división: ")
if operación == "+" :
    num1 = int(input("Introduzca el primer sumando: "))
    num2 = int(input("Introduzca el segundo sumando: "))
    resultado = (num1 + num2)
elif operación == "-" :
    num1 = int(input("Introduzca el primer número: "))
    num2 = int(input("Introduzca el número que quieres restar: "))
    resultado = (num1 - num2)
elif operación == "*" :
    num1 = int(input("Introduzca el primer número: "))
    num2 = int(input("Introduzca el número por el que lo quieres multiplicar: "))
    resultado = (num1 * num2)
elif operación == "/" :
    num1 = int(input("Introduzca el dividendo: "))
    num2 = int(input("Introduzca el divisor: "))
    resultado = (num1 / num2)
else :
    print("Operación no válida.")
print("El resultado es", resultado)
