# Calcular si un número es par o impar
num = int(input ("Introduzca el número: "))

if num % 2 == 0: # % es para hacer el modulo, es decir, el resto de la division
    print ("El número ", num , "es par. ")
else:
    print ("El número ", num , "es impar. ")
