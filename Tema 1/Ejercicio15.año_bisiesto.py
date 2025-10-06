anyo = int(input("Intrduzca el año: "))
if (anyo % 4 == 0 and not anyo % 100 == 0) or (anyo % 400 == 0):
    print ("El año", anyo, " es un año bisiesto.")
else:
    print ("El año", anyo, " no es un año bisiesto")
