# Programa de login que la contraseña tenga al menos 8 caracteres

usuario  = input ("Introduzca el usuario: ")
clave = input("Introduzca clave: ")
longitud = len(clave)

while longitud < 8:
    clave = input("Introduzca una clave más larga: ")
    longitud = len(clave)
else:
    print("Bienvenido,", usuario + "!")

