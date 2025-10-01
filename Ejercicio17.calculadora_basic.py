operación = input("Indique la operación que quiere realizar: ")
if operación == "suma" :
    num1 = int(input("Introduzca el primer sumando: "))
    num2 = int(input("Introduzca el segundo sumando: "))
    print("La suma es igual a ", num1 + num2)
elif operación == "resta" :
    num1 = int(input("Introduzca el primer número: "))
    num2 = int(input("Introduzca el número que quieres restar: "))
    print("La resta es igual a ", num1 - num2)
elif operación == "multiplicación" :
    num1 = int(input("Introduzca el primer número: "))
    num2 = int(input("Introduzca el número por el que lo quieres multiplicar: "))
    print("La multiplicación es igual a ", num1 * num2)
elif operación == "división" :
    num1 = int(input("Introduzca el dividendo: "))
    num2 = int(input("Introduzca el divisor: "))
    print("La división es igual a ", num1 / num2)
else :
    print("Operación no válida, pruebe suma, resta, multiplicación o división.")
