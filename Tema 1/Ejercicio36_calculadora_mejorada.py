#Calculadora basica
import math
operación = input("Indique la operación que quiere realizar\n+ para suma\n- para resta\n* para multiplicación\n/ para división\n root para raíz cuadrada\n power para potencia: ")
num1 = int(input("Escriba un número: "))
if operación == "+" :
    num2 = int(input("Introduzca el segundo sumando: "))
    resultado = (num1 + num2)
elif operación == "-" :
    num2 = int(input("Introduzca el número que quieres restar: "))
    resultado = (num1 - num2)
elif operación == "*" :
    num2 = int(input("Introduzca el número por el que lo quieres multiplicar: "))
    resultado = (num1 * num2)
elif operación == "/" :
    num2 = int(input("Introduzca el divisor: "))
    resultado = (num1 / num2)
elif operación == "root":
    resultado = math.sqrt(num1)
elif operación == "power":
    num2 = int(input("Introduzca a cuánto quiere elevar el número: "))
    resultado = math.pow(num1, num2)
else :
    print("Operación no válida.")
print("El resultado es", resultado)
