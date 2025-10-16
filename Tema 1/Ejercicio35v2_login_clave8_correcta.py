# Programa de login que la contraseña tenga al menos 8 caracteres

USUARIO_CORRECTO = "user"
usuario  = input ("Introduzca el usuario: ")
CLAVE_CORRECTA = "12345678"
clave = input("Introduzca clave: ")
longitud = len(clave)

while longitud < 8 or clave != CLAVE_CORRECTA:
    clave = input("Introduzca la clave correcta: ")
    longitud = len(clave)
else:
    print("Bienvenido,", usuario + "!")

